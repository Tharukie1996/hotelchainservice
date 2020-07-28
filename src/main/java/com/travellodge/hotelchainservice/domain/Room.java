package com.travellodge.hotelchainservice.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@ToString
public class Room {

    @Getter
    @Setter
    private String roomNo;

    @Getter
    @Setter
    private List<String> bookingIds;

    @Getter
    @Setter
    private List<BookedDates> bookedDatesList;

    public Room() {
    }

    public Room(String roomNo, List<String> bookingIds, List<BookedDates> bookedDatesList) {
        this.roomNo = roomNo;
        this.bookingIds = bookingIds;
        this.bookedDatesList = bookedDatesList;
    }

    public Room(String roomNo) {
        this.roomNo = roomNo;
    }

    public boolean isRoomAvailable(Date guestCheckInDate, Date guestCheckOutDate) {

        return this.bookedDatesList.stream().noneMatch(bookedDates ->
            guestCheckInDate.toInstant().equals(bookedDates.getCheckInDate().toInstant()) ||
                    guestCheckOutDate.toInstant().isAfter(bookedDates.getCheckInDate().toInstant())
        );
    }
}
