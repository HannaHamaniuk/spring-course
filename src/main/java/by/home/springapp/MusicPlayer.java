package by.home.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    ClassicalMusic music1;
    PopMusic music2;

    @Autowired
    public MusicPlayer(ClassicalMusic music1, PopMusic music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic(MusicGenre genre) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if(genre ==MusicGenre.CLASSICAL){
            System.out.println(music1.getSongs().get(randomNumber));
        }else{
            System.out.println(music2.getSongs().get(randomNumber));
        }


    }


}
