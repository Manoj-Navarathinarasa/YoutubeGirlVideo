package com.scannerclass;

import java.util.Scanner;

public class ScoundWorkScanner {
	public static void main(String args []) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Hi Please Enter your Name: ");
		String name = scanner.next();
		
		System.out.println("Hi "+name+" how are you" );
		
	}
}
