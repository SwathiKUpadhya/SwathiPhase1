package com.phase1.accessmodifier2;
import com.phase1.accessmodifiers.PersonData;

public class MainTest extends PersonData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		MainTest test = new MainTest();
		
		System.out.println(test.getAge()); //Public
		
		System.out.println(test.salary); // Protected
		
		


	}

}
