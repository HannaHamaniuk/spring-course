package by.home.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music = (Music) context.getBean("pop");
        MusicPlayer musicPlayer =new MusicPlayer(music);
        musicPlayer.playMusic();


    }

}
