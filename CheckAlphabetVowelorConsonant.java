package com.bridgelabz;

import java.util.Scanner;

public class CheckAlphabetVowelorConsonant {
	
	public static int checkalphabet(char ch)
	{
		switch (ch) 
		{
		case 'a':System.out.println( "it is a vowel");
                  break; 
		case 'e':System.out.println( "it is a vowel");
                  break;	
		case 'i':System.out.println( "it is a vowel");
                   break;
		case 'o':System.out.println( "it is a vowel");
                  break;
		case 'u':System.out.println( "it is a vowel");
                   break;
			
		default: System.out.println("it is a  Consonant");
		          break;
		}
		
	return 1;	
		
	}
	
	
	public static void main(String [] args ) 
	{
	   System.out.println("Enter the alphabet");
	   Scanner sc=new Scanner(System.in);
	   char ch=sc.next().charAt(0);
	   checkalphabet(ch);
	   sc.close(); 
	}

}

