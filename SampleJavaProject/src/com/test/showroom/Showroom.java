package com.test.showroom;

import com.sample.maruti.Maruti;

public class Showroom {
	
	public static void main(String args []) 
	{
		Maruti objMaruti = new Maruti();
		//inherited from Vihicle class
		objMaruti.doors();
		// overiden in the maruti class
		objMaruti.wheels();
		
		//parameterised constructor call
		Maruti objMaruti1 = new Maruti("RED");
		objMaruti1.wheels();
	}

}
