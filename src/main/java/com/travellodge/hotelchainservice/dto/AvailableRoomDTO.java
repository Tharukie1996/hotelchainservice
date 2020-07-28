package com.travellodge.hotelchainservice.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class AvailableRoomDTO {


    @Getter
    @Setter
    private String roomCode;

    @Getter
    @Setter
    private String bedType;

    @Getter
    @Setter
    private String bedCount;

    @Getter
    @Setter
    private String desc;

    @Getter
    @Setter
    private String rent;

    @Getter
    @Setter
    private int availableRoomCount;

    public AvailableRoomDTO() {
    }

    public AvailableRoomDTO(String roomCode, String bedType, String bedCount, String desc, String rent, int availableRoomCount) {
        this.roomCode = roomCode;
        this.bedType = bedType;
        this.bedCount = bedCount;
        this.desc = desc;
        this.rent = rent;
        this.availableRoomCount = availableRoomCount;
    }
}
