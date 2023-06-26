package ru.semenov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "ApplicationContext.xml");
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer.toString());
        context.close(); 
        }
    }
}
//Music music = context.getBean("musicBean", Music.class);
//MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//        musicPlayer.playMusic();
//        Music music = context.getBean("rockMusic", Music.class);
//
//        System.out.println(music.getSong());
//
//        Music music2 = context.getBean("jazzMusic", Music.class);
//
//        System.out.println(music2.getSong());
//
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

//        musicPlayer.playMusic();
//        Computer computer = context.getBean("computer", Computer.class);

//         try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                 "ApplicationContext.xml")) {

//             Computer computer = context.getBean("computer", Computer.class);
//             System.out.println(computer.toString());
          
//                   MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

