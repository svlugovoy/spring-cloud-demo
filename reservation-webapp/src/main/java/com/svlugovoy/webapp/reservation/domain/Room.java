package com.svlugovoy.webapp.reservation.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Room {
    private long id;
    private String name;
    private String roomNumber;
    private String bedInfo;
}
