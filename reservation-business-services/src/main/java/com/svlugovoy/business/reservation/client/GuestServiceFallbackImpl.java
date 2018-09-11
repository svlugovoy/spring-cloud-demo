package com.svlugovoy.business.reservation.client;

import com.svlugovoy.business.reservation.domain.Guest;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class GuestServiceFallbackImpl implements GuestService {
    @Override
    public List<Guest> findAll(String emailAddress) {
        return Collections.emptyList();
    }

    @Override
    public Guest findOne(long id) {
        Guest guest = new Guest();
        guest.setFirstName("Guest");
        guest.setLastName("Occupied");
        return guest;
    }
}
