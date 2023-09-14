package by.home.springapp2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }
    public String playMusic(){
        Random random = new Random();
        int number = random.nextInt(3);
        return musicList.get(number).getSong();

    }
}
