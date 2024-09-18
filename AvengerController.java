package com.contact.controller;

import com.contact.entity.Avenger;
import com.contact.service.AvengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/avenger")
public class AvengerController {

    @Autowired
    private AvengerService avengerService;

    @PostMapping("/register")
    public Avenger registerAvenger(@RequestBody Avenger avenger) {
        return avengerService.registerAvenger(avenger);
    }
}