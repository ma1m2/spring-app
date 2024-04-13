package org.example.springcourse;

public class MusicPlaer {
    private Music music;

    //Inversion of Control (IoC)
    public MusicPlaer(Music music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }
}
