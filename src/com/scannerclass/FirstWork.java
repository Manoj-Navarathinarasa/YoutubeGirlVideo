package com.scannerclass;

import java.util.Scanner;

public class FirstWork {
	public static void main (String args []) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Hi what is your name ?");
		String name = scanner.next();
		
		System.out.println("Please enter your age please?");
		int age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("please enter your Phone number :");
		String number = scanner.next();
		
		System.out.println("hi dear :"+name);
		System.out.println("Your age is :"+age);
		System.out.println("This is yor moblie number :"+number);
		
		
	}

}
