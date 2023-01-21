package com.Conniceweb.demo.dao;

import com.Conniceweb.demo.model.Apartment;

import java.util.UUID;

public interface ApartmentDao {

    int  insertApartment(UUID id, Apartment apartment);

    default  int insertApartment(Apartment apartment ){
        UUID id = UUID.randomUUID();
        return insertApartment(id, apartment);
    }

}
