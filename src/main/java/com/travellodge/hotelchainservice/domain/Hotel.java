package com.travellodge.hotelchainservice.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "hotel")
public class Hotel {

    @Id
    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String location;

    public Hotel() {
    }

    public Hotel(String name, String location) {
        this.name = name;
        this.location = location;
    }
}
