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



    public String playMusic() {
      return "Playing " + classicalMusic.getSong();

    }


}
