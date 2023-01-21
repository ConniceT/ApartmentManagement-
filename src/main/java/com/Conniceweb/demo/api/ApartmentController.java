package com.Conniceweb.demo.api;

import com.Conniceweb.demo.model.Apartment;
import com.Conniceweb.demo.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApartmentController {
    private final ApartmentService apartmentService;

    @Autowired
    public ApartmentController(ApartmentService apartmentService) {
        this.apartmentService = apartmentService;
    }
    @PostMapping
    public void addApartment(Apartment apartment){
        apartmentService.addApartment(apartment);
    }
}
