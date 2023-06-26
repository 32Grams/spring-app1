package ru.semenov.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class JazzMusic implements Music {
    List<String> songs;

    public JazzMusic() {
        songs = Arrays.asList("Fly me to the moon", "Take Five", "SummerTime");
    }

    @Override
    public String getSong() {
        return songs.get((int) (Math.random()*3));
    }
}
