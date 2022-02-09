package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {
	
	public static float FindHarmonic(int N) 
	{
		
		float result = 0;
		if(N != 0) {
			
			for(int i= 1; i<= N; i++) {                    
				                                           
				result = result + (float)1/i;            
	        }                                            
		}                                                    
		                                                
		else {  
			System.out.println("Invalid Input");        
		}                                                
		return result;                                   
	}                                                    
	public static void main(String[] args) {             
		                                                
		                                                 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Harmonic value : ");
		int N = sc.nextInt();
		float value = FindHarmonic(N);
		System.out.printf("Sum of Harmonic value : %.3f " , value );
	    sc.close();	
	}

}
