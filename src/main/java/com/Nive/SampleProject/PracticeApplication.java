package com.Nive.SampleProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;





@SpringBootApplication
@ComponentScan({"com.Nive.SampleProject","com.Nive.SampleProject.Extends"})
public class PracticeApplication {
public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(PracticeApplication.class, args);
	
		VechicleDemo vec =context.getBean(VechicleDemo.class);
	     vec.run();
	
	    
	     
	     
	}

}
