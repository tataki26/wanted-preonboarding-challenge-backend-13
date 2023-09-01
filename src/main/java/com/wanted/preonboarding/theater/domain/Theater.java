package com.wanted.preonboarding.theater.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Theater {
    public void enter(Audience audience, TicketSeller ticketSeller){
        if(audience.checkInvitation()){
            Ticket ticket = ticketSeller.getTicket();
            audience.receiveTicket(ticket);
        }else {
            Ticket ticket = ticketSeller.getTicket();
            audience.payForTicket(ticket.getFee());
            ticketSeller.sellTicket(ticket.getFee());
            audience.receiveTicket(ticket);
        }
    }
}
