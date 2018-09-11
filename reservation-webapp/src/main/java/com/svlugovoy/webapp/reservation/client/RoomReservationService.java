package com.svlugovoy.webapp.reservation.client;

import com.svlugovoy.webapp.reservation.domain.Room;
import com.svlugovoy.webapp.reservation.domain.RoomReservation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("RESERVATIONBUSINESSSERVICES")
@Component
public interface RoomReservationService {

    @RequestMapping(value = "/rooms", method = RequestMethod.GET)
    List<Room> getAllRooms(@RequestParam(name = "roomNumber", required = false) String roomNumber);

    @RequestMapping(value="/roomReservations/{date}", method=RequestMethod.GET)
    List<RoomReservation> getRoomReservationsForDate(@PathVariable("date") String date);
}
