package ru.chebanov.springLesson8;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestJava8 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext8.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);

        System.out.println(classicalMusic.getSong());


        context.close();
    }
}