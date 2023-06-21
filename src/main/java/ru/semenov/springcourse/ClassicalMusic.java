package ru.semenov.springcourse;

import org.springframework.stereotype.Component;
@Component
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
    //    public void doMyInit() {
//        System.out.println("Doing my initialisation");
//    }
//
//    public void doMyDestroy() {
//        System.out.println("Doing my destruction");
//    }

}
