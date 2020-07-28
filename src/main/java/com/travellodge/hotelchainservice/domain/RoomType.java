package com.travellodge.hotelchainservice.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.ArrayList;

@ToString
@Document(collection = "roomType")
public class RoomType {
    @Id
    @Getter
    @Setter
    private String roomCode;

    @Getter
    @Setter
    private String hotelId;

    @Getter
    @Setter
    private int maxOccupancy;

    @Getter
    @Setter
    private int minOccupancy;

    @Getter
    @Setter
    private String bedType;

    @Getter
    @Setter
    private int bedCount;

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    private BigDecimal rent;

    @Getter
    @Setter
    private ArrayList<Room> rooms;

    public RoomType() {
    }

    public RoomType(String roomCode, int maxOccupancy, int minOccupancy, String bedType, int bedCount, String description, BigDecimal rent, ArrayList<Room> rooms) {
        this.roomCode = roomCode;
        this.maxOccupancy = maxOccupancy;
        this.minOccupancy = minOccupancy;
        this.bedType = bedType;
        this.bedCount = bedCount;
        this.description = description;
        this.rent = rent;
        this.rooms = rooms;
    }
}
