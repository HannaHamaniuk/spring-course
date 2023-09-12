package by.home.springapp;

public class MusicPlayer {
    private Music music;


    //Inversion of controll
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void playMusic(){
        System.out.println("playing "+music.getSong());
    }

    public void setMusic(Music music) {
        this.music = music;
    }
}
