package com.Conniceweb.demo.service;


import com.Conniceweb.demo.dao.ApartmentDao;
import com.Conniceweb.demo.model.Apartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ApartmentService {
    private  final ApartmentDao apartmentDao;

    @Autowired
    public ApartmentService(@Qualifier("FakeDao") ApartmentDao apartmentDao) {
        this.apartmentDao = apartmentDao;
    }

    public int addApartment(Apartment apartment){
        return apartmentDao.insertApartment(apartment);
    }
}
