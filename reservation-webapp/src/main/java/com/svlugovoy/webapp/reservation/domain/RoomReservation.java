package com.svlugovoy.webapp.reservation.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class RoomReservation {
    private long roomId;
    private long guestId;
    private String roomName;
    private String roomNumber;
    private String firstName;
    private String lastName;
    private String date;
}