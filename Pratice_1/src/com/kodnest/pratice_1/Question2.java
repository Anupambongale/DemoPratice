//WAJP to perform the division of 2 numbers(long) and 
//display the quotient and reminder 

package com.kodnest.pratice_1;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter A value :");
		long a = scan.nextLong();
		System.out.println("Enter B value :");
		long b=scan.nextLong();
		System.out.println("The Quotient is :"+(a/b));
		System.out.println("The Remainder is :"+(a%b));
		
		
	}
	}
