package com.sample.maruti;

import com.sample.vehicle.Vihicle;

public class Maruti extends Vihicle {
	String color;

	public Maruti() {
		// TODO Auto-generated constructor stub
		
	}
	
	public  Maruti(String color) 
	{
		this.color = color;
		
	}
	
	public void wheels() 
	  {
		// this variable value is defined by the way the class is is instantited
		if(color!=null)
		 System.out.println("The color of car is " + color);
		
		  System.out.println("Has overriden wheels method");
		  
	  }
	
}
