package org.example.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlaer musicPlaer = new MusicPlaer(music);

        MusicPlaer musicPlaer = context.getBean("musicPlaer", MusicPlaer.class);;
        musicPlaer.playMusic();
        context.close();
    }
}
