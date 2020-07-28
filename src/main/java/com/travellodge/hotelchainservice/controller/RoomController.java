package com.travellodge.hotelchainservice.controller;

import com.travellodge.hotelchainservice.domain.BookedDates;
import com.travellodge.hotelchainservice.dto.AvailableRoomDTO;
import com.travellodge.hotelchainservice.service.RoomService;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

@CrossOrigin
@RestController("/api/rooms")
public class RoomController {

    private final RoomService roomService;

    @Inject
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/available/{hotelId}")
    List<AvailableRoomDTO> getAvailableRooms(@PathVariable String hotelId, @RequestBody BookedDates bookedDates,
            @RequestParam int roomCount, @RequestParam int guestCount) {
        return roomService.getAvailableRooms(hotelId, bookedDates.getCheckInDate(), bookedDates.getCheckOutDate(), roomCount, guestCount);
    }

}
