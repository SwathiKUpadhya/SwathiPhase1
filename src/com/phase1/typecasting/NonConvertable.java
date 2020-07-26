package com.phase1.typecasting;

import java.util.Scanner;

public class NonConvertable {

	public static void main(String[] args) {
		// Cannot convert char to boolean to other types
		
	char firstChar = 'C';
	
	int number = 100;
	
	firstChar = (char) number;

    System.out.println("firstChar" + firstChar);
    
    //String Conversion
    
    String price = "100";
    
    int priceInt = Integer.parseInt(price); //wrapper class (primitive to non primitive)
    
    System.out.println("priceInt" + priceInt);
    
    int num = 10;
    
    String data = String.valueOf(10);
    
    System.out.println("data" + data);
    
    //TYpe conversion based on user input from console.
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("ENTER A NUMBER FROM 1 TO 100");
    
    String userNumber = input.nextLine(); //will accept all values
    
    System.out.println("User Input as INteger:" +userNumber);
    
    

	}

}
