package com.company;

public class BackgroundSinger extends Singer {

    public BackgroundSinger(String alias, String name, String surname) {
        super(alias, name, surname);
    }

    @Override
    public void playMusic() {
        System.out.println("LiLaLuLiLaLu");
    }
}