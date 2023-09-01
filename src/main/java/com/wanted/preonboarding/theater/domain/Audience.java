package com.wanted.preonboarding.theater.domain;

public class Audience {
    private final Bag bag;

    public Audience(Bag bag){
        this.bag = bag;
    }

    public Bag getBag(){ return bag;}

    public boolean checkInvitation() {
        return bag.hasInvitation();
    }

    public void payForTicket(long amount) {
        bag.minusAmount(amount);
    }

    public void receiveTicket(Ticket ticket) {
        bag.setTicket(ticket);
    }
}