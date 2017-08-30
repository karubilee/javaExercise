package com.Liber;

public class Printer {
	 public static <T> void printArray(T[] objects) {
	        if (objects != null) {
	            for(T element : objects){  
	                System.out.printf("%s",element);  
	            }  
	            System.out.printf("\n");  
	        }
	    }
}
