package com.travellodge.hotelchainservice.controller;

import com.travellodge.hotelchainservice.domain.Hotel;
import com.travellodge.hotelchainservice.service.HotelService;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

@CrossOrigin
@RestController("api/hotels")
public class HotelController {

    private final HotelService hotelService;

    @Inject
    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping("/getAll")
    public List<Hotel> getAllHotels() {
        return hotelService.getAllHotels();
    }

    @GetMapping("/get")
    public List<Hotel> getDestinationHotels(@RequestParam(value = "destination") String destination) {
        return hotelService.getDestinationHotels(destination);
    }
}
