package com.svlugovoy.business.reservation;


import com.svlugovoy.business.reservation.domain.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class RoomReservationController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/rooms")
    public List<Room> getAllRooms(){
        ResponseEntity<List<Room>> roomsResponse = this.restTemplate.exchange(
                "http://ROOMSERVICES/rooms", HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Room>>() {
                });
        return roomsResponse.getBody();
    }

}
