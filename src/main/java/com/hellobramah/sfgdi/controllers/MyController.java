package com.hellobramah.sfgdi.controllers;

import com.hellobramah.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greetings(){

       return greetingService.announceGreetings();

    }
}
