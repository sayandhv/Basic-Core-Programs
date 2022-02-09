package com.bridgelabz;

import java.util.Scanner;

;

public class LargestOfThree {
	public void Largest()
    {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enetr first no: ");
		int n1 = scanner.nextInt();
		System.out.println("Enetr second no: ");
		int n2 = scanner.nextInt();
		System.out.println("Enetr third no: ");
		int n3 = scanner.nextInt();
		if(n1 > n2 && n1 > n3) {
			System.out.println("The largest Number is : " + n1);
		}
		else if(n2 > n1 && n2 > n3){
			System.out.println(" The largest Number : " + n2);                
		}
		else {
			System.out.println("The largest Number : " + n3);
		}	
    }
	public static void main(String[] args) {
		
		LargestOfThree largestOfThree = new LargestOfThree();
		largestOfThree.Largest();
	}

}
