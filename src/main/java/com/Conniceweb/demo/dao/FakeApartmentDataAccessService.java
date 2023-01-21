package com.Conniceweb.demo.dao;

import com.Conniceweb.demo.model.Apartment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeApartmentDataAccessService implements ApartmentDao {

    private static List<Apartment> DB = new ArrayList<>();
    @Override
    public int insertApartment(UUID id, Apartment apartment) {
        DB.add(new Apartment(id, apartment.getName(), apartment.getCount()
        ));
        return 1;
    }
}
