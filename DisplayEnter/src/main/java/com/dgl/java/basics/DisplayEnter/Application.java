package com.dgl.java.basics.DisplayEnter;

import java.util.Scanner;

public class Application
{
	public static void main( String[] args )
	{
		try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter a Number: ");
            int number = sc.nextInt();
            System.out.println("The value you entered is this ");
            System.out.println(number);
            
        }
		
		
	}
}