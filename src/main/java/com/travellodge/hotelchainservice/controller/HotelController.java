package com.travellodge.hotelchainservice.controller;

import com.travellodge.hotelchainservice.domain.Hotel;
import com.travellodge.hotelchainservice.service.HotelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

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

    @GetMapping("/destination/{destination}")
    public List<Hotel> getDestinationHotels(@PathVariable String destination) {
        return hotelService.getAllHotels();
    }
}
