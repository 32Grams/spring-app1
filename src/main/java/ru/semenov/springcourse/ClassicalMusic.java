package ru.semenov.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    List<String> songs;
    public ClassicalMusic() {
        songs = Arrays.asList("Hungarian Rhapsody", "Little Swan Dance", "Korobeiniki");
    }

    @Override
    public String getSong() {
        return songs.get((int) (Math.random() * 3));
    }
}
    //    public void doMyInit() {
//        System.out.println("Doing my initialisation");
//    }
//
//    public void doMyDestroy() {
//        System.out.println("Doing my destruction");
//    }


