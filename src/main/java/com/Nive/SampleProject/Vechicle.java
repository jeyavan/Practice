package com.Nive.SampleProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vechicle {
	@Autowired
	private  VechicleDemo vec;
	public Vechicle(VechicleDemo vec) {
		this.vec=vec;
	}

	
}
