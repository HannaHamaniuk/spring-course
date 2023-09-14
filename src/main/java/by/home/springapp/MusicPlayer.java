package by.home.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private PopMusic popMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, PopMusic popMusic) {
        this.classicalMusic = classicalMusic;
        this.popMusic = popMusic;
    }



    public void playMusic() {
        System.out.println("Playing " + classicalMusic.getSong());
        System.out.println("Playing " + popMusic.getSong());
    }


}
