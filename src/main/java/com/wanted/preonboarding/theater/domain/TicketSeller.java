package com.wanted.preonboarding.theater.domain;

public class TicketSeller {
    private final TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice){
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice(){
        return ticketOffice;
    }

    public Ticket getTicket() {
        return ticketOffice.getTicket();
    }

    public void sellTicket(long amount) {
        ticketOffice.plusAmount(amount);
    }
}
