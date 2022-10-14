package com.spring.sfgdi;

import com.spring.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = {"com.spring.sfgdi", "com.spring.pets"})
@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		//	PetController
		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("------- The Best Pet is ------");
		System.out.println(petController.whichPetIsTheBest());
		System.out.println("------------------------------");

		MyController myController = (MyController) ctx.getBean("myController");
		String greeting =  myController.sayHello();

		//	System.out.println(greeting);
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		// Dependency Injection and Inversion of Control
		System.out.println("**** Primary Bean ****");
		System.out.println(myController.sayHello());

		System.out.println("**** Property Based Controller ****");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("**** Setter Based Controller ****");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("**** Constructor Based Controller ****");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}

}
