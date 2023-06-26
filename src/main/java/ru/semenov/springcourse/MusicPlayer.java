package ru.semenov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private final Music rockMusic;
    private final Music classicalMusic;
    private final Music jazzMusic;
    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rockMusic,
                       @Qualifier("classicalMusic") Music classicalMusic,
                       @Qualifier("jazzMusic") Music jazzMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
        this.jazzMusic = jazzMusic;
    }

    public String playMusic(Genre genre) {
        switch (genre) {
            case ROCK:
                return rockMusic.getSong();
            case CLASSICAL:
                return classicalMusic.getSong();
            case JAZZ:
                return jazzMusic.getSong();
        }
        return null;
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