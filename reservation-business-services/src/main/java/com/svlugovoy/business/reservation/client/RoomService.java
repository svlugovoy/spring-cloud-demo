package com.svlugovoy.business.reservation.client;

import com.svlugovoy.business.reservation.domain.Room;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value="ROOMSERVICES")
@Component
public interface RoomService {

    @GetMapping(value="/rooms")
    List<Room> findAll(@RequestParam(name = "roomNumber", required = false) String roomNumber);
}
