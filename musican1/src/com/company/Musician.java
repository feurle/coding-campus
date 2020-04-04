package com.company;

public class Musician extends Artist {

    public Musician(String alias, String name, String surname)
    {
        super(alias, name, surname);
    }

    public void playMusic(){
        System.out.println("LiLaLuLiLaLu");
    }
}