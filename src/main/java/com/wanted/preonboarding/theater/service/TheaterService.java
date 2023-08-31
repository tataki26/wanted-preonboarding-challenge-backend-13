package com.wanted.preonboarding.theater.service;

import com.wanted.preonboarding.theater.domain.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TheaterService {
    private TicketOffice ticketOffice;

    public String enter(Audience audience) {
        if (!audience.isTicketHolder()) {
            ticketOffice.sellTicket(100L);
        }
        return "Have a good time";
    }
}
