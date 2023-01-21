package com.Conniceweb.demo.model;

import java.util.UUID;

public class Apartment {
    private final UUID id;
    private final  String name;
    private  final int count;

    public Apartment (UUID id, String name, int count ){
        this.id = id;
        this.name = name;
        this.count = count;
    }

    public  UUID getId(){
        return  id;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }
}
