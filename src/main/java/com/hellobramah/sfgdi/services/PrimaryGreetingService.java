package com.hellobramah.sfgdi.services;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
//Using the primaray bean
@Primary
@Service
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String announceGreetings() {
        return "Hello Everyone from the primary Service";
    }
}
