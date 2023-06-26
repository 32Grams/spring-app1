package ru.semenov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private  final Genre[] genre = new Genre[]{Genre.CLASSICAL, Genre.ROCK, Genre.JAZZ};
    private final MusicPlayer musicPlayer;
    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer: id = " + id + " " + musicPlayer.playMusic(genre[(int) (Math.random()*3)]);
    }
}
