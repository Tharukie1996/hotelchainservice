package com.travellodge.hotelchainservice.controller;

import com.travellodge.hotelchainservice.domain.BookedDates;
import com.travellodge.hotelchainservice.dto.AvailableRoomDTO;
import com.travellodge.hotelchainservice.service.RoomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

@RestController("/api/rooms")
public class RoomController {

    private final RoomService roomService;

    @Inject
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/available/{hotelId}")
    List<AvailableRoomDTO> getAvailableRooms(@PathVariable String hotelId, @RequestParam BookedDates bookedDates,
            @RequestParam int roomCount, @RequestParam int guestCount) {
        return roomService.getAvailableRooms(hotelId, bookedDates.getCheckInDate(), bookedDates.getCheckOutDate(), roomCount, guestCount);
    }

}
