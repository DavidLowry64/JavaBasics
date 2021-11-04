package com.dgl.java.basics.controlStatement;

public class Application
{
	public static void main( String[] args )
	{
		int a = 5, b=7, c = 50, i = 1;
		
		// Decision Making Statement
		decisionMaking(a,b);
		// Switch Statement
		switchStatement(c);
		// Iteration Structures
		iterationStatement(i);
		// Jump Statements
		jumpStatement();
	}
	
	public static void decisionMaking(int a, int b)
	{
		if(a == b)
		{
			System.out.println("They are equal");
		}
		else if ( a > b)
		{
			System.out.println("a is greater than b");
		}
		
		else 
		{
			System.out.println("a is less than b");
		}
		
		
		
	}
	

	public static void switchStatement(int a)
	{
		switch(a) 
		{
		case 18:
		System.out.println ("You are 18");
		break;
		case 21:
		System.out.println ("You are basrely legal");
		break;
		case 25:
		System.out.println ("You insurance rates got better");
		break;
		case 50:
			System.out.println ("You are old");
			break;
		default:
		System.out.println ("age not in list");
		}// switch

		System.out.println("Hello switch");
	}
	
	public static void iterationStatement(int i)
	{
	    // do while loop
		do {
	    System.out.println("do while loop counter " + i);    
	    i++;    
	    }while(i<=5);
		
		// while loop
			
			while(i<5)
			{
			System.out.println("While loop counter " + i);
			i++;
			}
				
				// for loop
			
			for(int j=1;j<=10;j++){  
		        System.out.println("The for loop counter " + j);  
		    }  
			
		// for each loop
			
			// create an array
		    int[] numbers = {3, 9, 5, -5};
		    
		    // for each loop 
		    for (int number: numbers) {
		      System.out.println("The for each loop " + number);
		    }
		
		System.out.println("Hello iteration");
	}
	
	public static void jumpStatement()
	{
		 // the for loop is labeled as first
        first:
        for( int i = 1; i < 5; i++) {

            // the for loop is labeled as second
            second:
            for(int j = 1; j < 3; j ++ ) {

                System.out.println("i = " + i + "; j = " +j);
       
                // the break statement terminates the loop labeled as second   
                if ( i == 2)
                    break second;
            }
        }
	}
	
}