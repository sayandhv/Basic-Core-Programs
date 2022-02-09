package com.bridgelabz;

import java.util.Scanner;

public class FlipCoin {

	public static void flipPercentage(int flipCount , float headCount , float tailCount) 
	{
		
		float headPercentage = (float)(headCount * 100) / flipCount;
		float tailPercentage = (float)(tailCount * 100) / flipCount;
		System.out.println("Percentage of Head :  " +headPercentage);
		System.out.println("Percentage of Tail : " +tailPercentage );
	}
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);	
		int headCount = 0;
		int tailCount = 0;
		System.out.print("Enter the number of times to Flip coin : ");
		
		int flipCount = sc.nextInt();

		if(flipCount > 0) {
			for(int i=0; i<flipCount; i++) {
				//get 0 or 1 randomly
				float flipCoin = (float)(Math.random());
				if(flipCoin < 0.5) {
					tailCount++;
				}
				else {
					headCount++;
				}
			}
		}
		else {
			System.out.println("Ivalid Input");
		}
		flipPercentage(flipCount, headCount, tailCount);
	    sc.close();
	}

}
