package ru.semenov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private Music music1;
    private Music music2;

    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic")Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic() {
        return "\nPlaying: " + music1.getSong() + " and then " + music2.getSong();
    }
}

// УРОК 12
//public class MusicPlayer {
//    private RockMusic rockMusic;
//    private ClassicalMusic classicalMusic;
//    @Autowired
//    public MusicPlayer(RockMusic rockMusic, ClassicalMusic classicalMusic) {
//        this.rockMusic = rockMusic;
//        this.classicalMusic = classicalMusic;
//    }
//
//    public String playMusic() {
//        return "\nPlaying: " + rockMusic.getSong() + "\n" + "Playing: " + classicalMusic.getSong();
//    }
//}

/*
public class MusicPlayer {
    private List<Music> listOfMusic = new ArrayList<>();
    private String name;
    private int volume;


    //IoC
    public MusicPlayer(List<Music> music) {
        this.listOfMusic = music;
    }

    public void playMusic() {
        for(Music song: listOfMusic) {
            System.out.println("Playing: " + song.getSong());
        }
    }

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

    public MusicPlayer() {}

    public void setListOfMusic(List<Music> listOfMusic) {
        this.listOfMusic = listOfMusic;
    }

    @Autowired
    public void addMusic(Music music) {
        this.listOfMusic.add(music);
    }
}
*/