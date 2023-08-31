package com.wanted.preonboarding.theater.controller.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class AudienceRequestDto {
    private String name;
    private boolean hasTicket;

    public boolean isTicketHolder() {
        return hasTicket;
    }
}
