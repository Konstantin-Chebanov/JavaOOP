package ru.chebanov.springLesson10;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestJava10 {
	    public static void main(String[] args) {
	        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
	                "applicationContext10.xml"
	        );

	        Computer computer = context.getBean("computer", Computer.class);
	        System.out.println(computer);

	        context.close();
	    }
	}