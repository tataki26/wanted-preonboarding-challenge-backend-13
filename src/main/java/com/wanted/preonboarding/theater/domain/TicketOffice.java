package com.wanted.preonboarding.theater.domain;

import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
public class TicketOffice {
    private final Ticket ticket;

    public void sellTicket(Long count) {
        ticket.removeStock(count);
    }
}
