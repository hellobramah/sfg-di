package com.hellobramah.sfgdi;

import com.hellobramah.sfgdi.controllers.MyController;
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
	}

}
