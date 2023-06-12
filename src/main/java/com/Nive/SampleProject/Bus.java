package com.Nive.SampleProject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bus implements VechicleDemo {

	@Override
	public void run() {
		System.out.println(" Using polymorphism here");
		System.out.println("Bus Interface success");
		
	}
	

}
