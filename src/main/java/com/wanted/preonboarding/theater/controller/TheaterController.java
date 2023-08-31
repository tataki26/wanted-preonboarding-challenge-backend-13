package com.wanted.preonboarding.theater.controller;

import com.wanted.preonboarding.theater.controller.dto.AudienceRequestDto;
import com.wanted.preonboarding.theater.controller.dto.ResponseDto;
import com.wanted.preonboarding.theater.domain.Audience;
import com.wanted.preonboarding.theater.service.AudienceService;
import com.wanted.preonboarding.theater.service.TheaterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/theater")
@RequiredArgsConstructor
public class TheaterController {
    private final TheaterService theaterService;
    private final AudienceService audienceService;

    @GetMapping("hello")
    public ResponseDto welcomeMessage(){
        return new ResponseDto("Welcome to The Wanted Theater");
    }

    @PostMapping("enter")
    public ResponseDto enter(@RequestBody AudienceRequestDto audienceRequestDTO){
        Audience audience = audienceService.mapAudienceRequestDtoToAudience(audienceRequestDTO);
        return new ResponseDto(theaterService.enter(audience));
    }
}
