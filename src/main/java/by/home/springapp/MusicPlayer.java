package by.home.springapp;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private String name;
    private int volume;
    private Music music;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing "+ music.getSong());
    }




}
