package com.travellodge.hotelchainservice.service;

import com.travellodge.hotelchainservice.dto.AvailableRoomDTO;
import com.travellodge.hotelchainservice.repository.BookingRepository;
import com.travellodge.hotelchainservice.repository.RoomRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    private final BookingRepository bookingRepository;

    @Inject
    public RoomService(RoomRepository roomRepository, BookingRepository bookingRepository) {
        this.roomRepository = roomRepository;
        this.bookingRepository = bookingRepository;
    }

    public List<AvailableRoomDTO> getAvailableRooms(String hotelId, Date checkInDate, Date checkOutDate, int roomCount, int guestCount) {
        List<AvailableRoomDTO> availableRoomDTOList = new ArrayList<>();
        roomRepository.findAllByHotelIdAndMaxOccupancyIsGreaterThanEqual(hotelId, guestCount).forEach(roomType -> {
            AvailableRoomDTO availableRoomDTO = new AvailableRoomDTO();
            availableRoomDTO.setAvailableRoomCount((int) roomType.getRooms().stream().filter(room -> room.isRoomAvailable(checkInDate, checkOutDate)).count());
            if (availableRoomDTO.getAvailableRoomCount() > 0) {
                BeanUtils.copyProperties(roomType, availableRoomDTO);
                availableRoomDTOList.add(availableRoomDTO);
            }
        });
        return availableRoomDTOList;
    }

}
