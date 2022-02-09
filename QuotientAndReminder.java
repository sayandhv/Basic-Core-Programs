package com.bridgelabz;

import java.util.Scanner;

public class QuotientAndReminder {
	public void quotientReminder()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nmber to be devided: ");
		int num = sc.nextInt();
		System.out.println("Enetr the dividor: ");
		int divisor = sc.nextInt();
		int quotient = num/divisor;
		int remainder = num % divisor;
		System.out.println("Quotient is= " +quotient);
		System.out.println("Reminder is= " +remainder);	
	}
	public static void main(String[] args) {
		
           QuotientAndReminder quotientremainder = new QuotientAndReminder();
           quotientremainder.quotientReminder();

	}
}
