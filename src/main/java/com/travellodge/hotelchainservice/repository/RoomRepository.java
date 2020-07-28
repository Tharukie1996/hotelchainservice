package com.travellodge.hotelchainservice.repository;

import com.travellodge.hotelchainservice.domain.RoomType;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RoomRepository extends MongoRepository<RoomType, String> {

    List<RoomType> findAllByHotelIdAndMaxOccupancyIsGreaterThanEqual(String hotelId, int guestCount);
}
