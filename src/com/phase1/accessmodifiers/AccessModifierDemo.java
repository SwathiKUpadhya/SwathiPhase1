package com.phase1.accessmodifiers;

public class AccessModifierDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person();
		
		System.out.println(person.getAge());
		
		person.showAge();
		
		System.out.println(person.salary);
		
		


	}
}
	
	class Person{
		private int age =10;
		
		protected double salary = 190389.90;
		 void showAge() {
			 System.out.println("age is 10");
		 }
		 
			public int getAge() {
				return age;
			}
	}


