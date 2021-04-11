package com.hellobramah.sfgdi.controllers;

import com.hellobramah.sfgdi.services.GreetingService;

public class SetterInjectedController {
    private  GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return   greetingService.announceGreetings();
    }
}
