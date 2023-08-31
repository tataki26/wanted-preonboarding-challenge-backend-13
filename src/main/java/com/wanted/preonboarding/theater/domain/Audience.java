package com.wanted.preonboarding.theater.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Audience {
    private Long id;
    private String name;
    private boolean hasTicket;

    public boolean isTicketHolder() {
        return hasTicket;
    }
}