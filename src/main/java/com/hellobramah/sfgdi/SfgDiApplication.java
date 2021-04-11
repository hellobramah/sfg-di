package com.hellobramah.sfgdi;

import com.hellobramah.sfgdi.controllers.ConstructorInjectedController;
import com.hellobramah.sfgdi.controllers.MyController;
import com.hellobramah.sfgdi.controllers.PropertyInjectedController;
import com.hellobramah.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext appCon =SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) appCon.getBean("myController");
		String greet = myController.greetings();
		System.out.println(greet);

		System.out.println("------ Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) appCon.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) appCon.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------- Constructor" );
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) appCon.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
