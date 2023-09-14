package by.home.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class ClassicalMusic implements Music {
   private List<String>songs = new ArrayList<>();

    @Autowired
    public ClassicalMusic() {
        songs.add("Hungarian Rhapsody");
        songs.add("Karmen");
        songs.add("Night on bald mountain");
    }


    @Override
    public List<String> getSongs() {
        return songs;
    }

}
