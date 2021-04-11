package com.hellobramah.sfgdi.controllers;

import com.hellobramah.sfgdi.services.GreetingService;

public class ConstructorInjectedController {

    private final GreetingService greetingService;


    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return   greetingService.announceGreetings();
    }
}
