package com.travellodge.hotelchainservice.repository;

import com.travellodge.hotelchainservice.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
