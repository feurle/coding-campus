package com.company;

public class Singer extends Musician {

    public Singer(String alias, String name, String surname) {
        super(alias, name, surname);
    }

    public void sing(){
        System.out.println("LiLaLuLiLaLu");
    }

    @Override
    public void playMusic(){
        System.out.println("LiLaLu");
    }
}