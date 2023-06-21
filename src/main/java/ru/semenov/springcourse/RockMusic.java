package ru.semenov.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {

    List<String> songs;
    public RockMusic() {
        songs = Arrays.asList("Wind cries Mary", "I Wanna Rock", "Burn");
    }
    @Override
    public String getSong() {
        return songs.get((int) (Math.random() * 3));
    }
}
