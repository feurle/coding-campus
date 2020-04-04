package com.company;

public class Main {

    public static void main(String[] args) {

        Singer singer = new Singer("Lana Del Rey","Singer","Max");
        Guitarist guitarrist = new Guitarist("Daron Malakian","Daron","Maltikan");
        Bassist bassist = new Bassist("Shavo","Bass","Bruno");
        Trumpeter trumpeter = new Trumpeter("Bob Dylan","Dylan","Bob");
        BackgroundSinger backgroundSinger = new BackgroundSinger("Serj Tankian","Serj","Tankian");

        machtMusik(singer,guitarrist,bassist,trumpeter,backgroundSinger);
    }

    public static void machtMusik(Musician... group){
        for(Musician musician : group){
            musician.playMusic();
        }
    }

}