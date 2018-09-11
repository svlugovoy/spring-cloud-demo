package com.svlugovoy.business.reservation.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Reservation {
    private long id;
    private long roomId;
    private long guestId;
    private String reservationDate;
}
