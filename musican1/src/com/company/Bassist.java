package com.company;

public class Bassist extends Musician {

    public Bassist(String alias, String name, String surname) {
        super(alias, name, surname);
    }

    @Override
    public void playMusic(){
        System.out.println("LiLaLuLiLaLu");
    }
}