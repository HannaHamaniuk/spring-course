package by.home.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassicalMusic classicalMusic = context.getBean("musicBean2",ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//        context.close();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//        musicPlayer.playMusicList();

    }

}
