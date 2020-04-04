package com.company;

public class Guitarist extends Musician {

    public Guitarist(String artist, String name, String surname) {
        super(artist, name, surname);
    }

    @Override
    public void playMusic(){
        System.out.println("LiLaLuLiLaLu.");
    }
}