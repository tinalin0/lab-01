package com.example.petshop;

import java.util.Date;

public class Scorpion extends Pet implements Pettable{
    public Scorpion(String name) {
        super(name);
    }

    public Scorpion(String name, Date birthdate) {
        super(name, birthdate);
    }

    @Override
    public String speak() {
        return "hiss";
    }

    @Override
    public void pet() {

    }
}
