package com.contact.service;

import com.contact.entity.Avenger;
import com.contact.repository.AvengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvengerService {

    @Autowired
    private AvengerRepository avengerRepository;

    public Avenger registerAvenger(Avenger avenger) {
        return avengerRepository.save(avenger);
    }
}