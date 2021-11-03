package com.dgl.java.basics.EvenOrOdd;

import java.util.Scanner;

public class Application
{
	public static void main( String[] args )
	{
		
		   try (Scanner sc = new Scanner(System.in)) {

	            System.out.println("Enter Number: ");
	            int number = sc.nextInt();
	            if (number % 2 == 0) {
	                System.out.println("The number " + number + " is even");
	            } else {
	                System.out.println("The number " + number + " is odd");
	            }
	        }
		
	}
}