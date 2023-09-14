package by.home.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PopMusic implements Music {
    private List<String>songs = new ArrayList<>();

    @Autowired
    public PopMusic() {
        songs.add("Toxic");
        songs.add("Poker face");
        songs.add("Thriller");
    }

    public List< String> getSongs(){
      return songs;
    }
}
