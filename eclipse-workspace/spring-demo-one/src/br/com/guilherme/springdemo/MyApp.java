package br.com.guilherme.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		//create the object
		Coach theCoach = new SoccerCoach();
		
		//use the object
		System.out.println(theCoach.getDailyWorkout());

	}

}


/* SPRING

SPRING CONTAINER:
1 - Criar e gerir objetos (Inversion of control)

2 - Inserir dependências de objetos (Dependency Injection)


3 Maneiras de configurar um Spring Container:
XML Configuration file
Java Annotations
Java Source Code

============================================================

SRPING DEVELOPMENT PROCESS
1 -> Configure your Spring Beans => Pode ser visto no XML criando um bean
2 -> Create a Spring Container(ApplicationContext)
3 -> Retrieve Beans from Spring Containers
*/