package com.company;

public class Trumpeter extends com.company.Musician {

    public Trumpeter(String alias, String name, String surname) {
        super(alias, name, surname);
    }

    @Override
    public void playMusic(){
        System.out.println("LiLaLuLiaLu");
    }
}