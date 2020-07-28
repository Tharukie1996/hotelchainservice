package com.travellodge.hotelchainservice.repository;

import com.travellodge.hotelchainservice.domain.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface HotelRepository extends MongoRepository<Hotel, String> {
    List<Hotel> findAllByLocation(String location);
}
