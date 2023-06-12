package com.Nive.SampleProject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Car implements VechicleDemo  {

	@Override
	public void run() {
		System.out.println(" Using polymorphism here");
		System.out.println("Car Interface Success");
		
		
	}

}
