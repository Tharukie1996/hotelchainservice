package com.travellodge.hotelchainservice.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@ToString
@Document(collection = "booking")
public class Booking {

    @Id
    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private String userId;

    @Getter
    @Setter
    private String hotelId;

    @Getter
    @Setter
    private String roomId;

    @Getter
    @Setter
    private Date checkInDate;

    @Getter
    @Setter
    private Date checkOut;

    public Booking() {
    }

    public Booking(String id, String userId, String hotelId, String roomId, Date checkInDate, Date checkOut) {
        this.id = id;
        this.userId = userId;
        this.hotelId = hotelId;
        this.roomId = roomId;
        this.checkInDate = checkInDate;
        this.checkOut = checkOut;
    }
}
