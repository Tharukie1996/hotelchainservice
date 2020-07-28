package com.travellodge.hotelchainservice.repository;

import com.travellodge.hotelchainservice.domain.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookingRepository extends MongoRepository<Booking, String> {
}
