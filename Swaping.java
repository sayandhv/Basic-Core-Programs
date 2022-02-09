package com.bridgelabz;

import java.util.Scanner;


public class Swaping {
	public void Swap()
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter first no N1:");
		int n1 = sc.nextInt();
		System.out.println("Enter second no N2:");
		int n2 = sc.nextInt();
		int tempNo = n2;
		n2 = n1;
		n1 = tempNo;
		System.out.println("Afetr swaping");
		System.out.println("N1 = " +n1);
		System.out.println("N2 = " +n2);				
	}

	public static void main(String[] args) {
		
		Swaping swaping = new Swaping();
		swaping.Swap();
	}

}
