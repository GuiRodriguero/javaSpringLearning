package br.com.guilherme.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	public static void main(String[] args) {
		
		//load the spring configuration file										//Nome do XML
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class); //nome do id do bean, nome da interface interface
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
	
		//close the context
		context.close();
	}
}
