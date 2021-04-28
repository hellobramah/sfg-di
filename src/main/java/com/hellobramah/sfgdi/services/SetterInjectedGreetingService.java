package com.hellobramah.sfgdi.services;


import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService{
    @Override
    public String announceGreetings() {
        return "Hello my beautiful world -Setter";
    }

}
