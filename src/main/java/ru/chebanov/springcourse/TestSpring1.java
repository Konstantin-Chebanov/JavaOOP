package ru.chebanov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring1 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
		TestBean testBean = context.getBean("testBean", TestBean.class);
		System.out.print(testBean.getName());
		context.close();
	}
}
