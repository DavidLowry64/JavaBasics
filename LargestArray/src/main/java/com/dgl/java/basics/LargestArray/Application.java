package com.dgl.java.basics.LargestArray;

import java.util.Arrays;

public class Application
{
	
	 private static int usingIterative(final int[] array, int callOrder){
		   // Initialize maximum element
		        int max = array[0];
		      
		        // Traverse array elements from second and
		        // compare every element with current max  
		        for (int i = 1; i < array.length; i++){
		            if (array[i] > max){
		             max = array[i];
		            }
		        }
		        System.out.println(callOrder);
		        System.out.println(max);
		        return max;
		 }
	 
	 private static int usingLibrary(final int[] array, int callOrder){
		  Arrays.sort(array);
		  System.out.println(callOrder);
		  System.out.println(array[array.length -1]);

		  return array[array.length - 1];
		  		 }
	
	
	public static void main( String[] args )
	{
		
		 final int[] array = {12,34,56,12,13,454};
	        usingIterative(array, 1);
	        usingLibrary(array, 2);
	        
	        
	 }
	 
	
	}