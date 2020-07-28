package com.travellodge.hotelchainservice.service;

import com.travellodge.hotelchainservice.domain.Hotel;
import com.travellodge.hotelchainservice.repository.HotelRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class HotelService {

    private final HotelRepository hotelRepository;

    @Inject
    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    public List<Hotel> getDestinationHotels(String dest) {
        return hotelRepository.findByLocation(dest);
    }
}
