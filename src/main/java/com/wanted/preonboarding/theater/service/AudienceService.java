package com.wanted.preonboarding.theater.service;

import com.wanted.preonboarding.theater.controller.dto.AudienceRequestDto;
import com.wanted.preonboarding.theater.domain.Audience;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AudienceService {
    public Audience mapAudienceRequestDtoToAudience(AudienceRequestDto audienceRequestDTO) {
        return new Audience(100L, audienceRequestDTO.getName(), audienceRequestDTO.isTicketHolder());
    }
}
