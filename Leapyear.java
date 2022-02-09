package com.bridgelabz;

import java.util.Scanner;

public class Leapyear {
	      	
	        public void Yearcheck()
	        {
	        	Scanner scanner = new Scanner(System.in);
	            System.out.println("Enetr the year to br checked");
	            long year = scanner.nextLong();
	            if(year % 4 ==0 && year % 400 != 0)
	            {
	            	System.out.println("The year is leap year");
	            }
	            else {
	            	System.out.println("Not leap year");
	            }
	        	
	        }
	             
		public static void main(String[] args) {
			Leapyear leapYr = new Leapyear();
			leapYr.Yearcheck();
	     
		}

	}


