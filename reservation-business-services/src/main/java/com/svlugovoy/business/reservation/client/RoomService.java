package com.svlugovoy.business.reservation.client;

import com.svlugovoy.business.reservation.domain.Room;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value="ROOMSERVICES")
@Component
public interface RoomService {

    @GetMapping(value="/rooms")
    List<Room> findAll(@RequestParam(name = "roomNumber", required = false) String roomNumber);

    @RequestMapping(value="/rooms/{id}", method = RequestMethod.GET)
    Room findOne(@PathVariable("id") long id);
}
