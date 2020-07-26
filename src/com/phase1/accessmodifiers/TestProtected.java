package com.phase1.accessmodifiers;
import com.phase1.accessmodifiers.PersonData;

public class TestProtected extends PersonData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PersonData person = new PersonData();
		
		System.out.println(person.getAge()); //Public
		
		System.out.println(person.salary); 
		
		


	}

}
