package ru.semenov.springcourse;

import org.springframework.stereotype.Component;

public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Fly me to the moon";
    }
}
