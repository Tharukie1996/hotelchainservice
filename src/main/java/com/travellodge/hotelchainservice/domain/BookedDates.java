package com.travellodge.hotelchainservice.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class BookedDates {

    @Getter
    @Setter
    private Date checkInDate;

    @Getter
    @Setter
    private  Date checkOutDate;

    public BookedDates() {
    }

    public BookedDates(Date checkInDate, Date checkOutDate) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }
}
