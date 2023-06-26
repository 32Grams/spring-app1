package ru.semenov.springcourse;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
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
    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialisation");
    }
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }
}

