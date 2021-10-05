package ru.chebanov.springLesson11;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestJava11 {
	    public static void main(String[] args) {
	        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
	                "applicationContext11.xml"
	        );

	        Computer computer = context.getBean("computer", Computer.class);
	        System.out.println(computer);

	        context.close();
	    }
	}