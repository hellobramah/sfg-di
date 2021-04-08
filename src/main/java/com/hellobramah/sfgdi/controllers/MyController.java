package com.hellobramah.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String greetings(){
        System.out.println("Hello all you people");
        return "Hello you all";
    }
}
