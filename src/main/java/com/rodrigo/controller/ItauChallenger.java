package com.rodrigo.controller;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

@Repository
public class ItauChallenger {
    
    @GetMapping("/itauChallenger")
    public String getItauChallenger() {
        return "ItauChallenger";
    }
}
