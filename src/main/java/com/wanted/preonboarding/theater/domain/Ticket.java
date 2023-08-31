package com.wanted.preonboarding.theater.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Ticket {
    private Long fee;
    private long stock;

    public Ticket(Long fee, long stock) {
        this.fee = fee;
        this.stock = stock;
    }

    public void removeStock(long stock) {
        this.stock -= stock;
    }
    public void addStock(long stock) {
        this.stock += stock;
    }
}
