/*
WAJP to declare and initialize two float values
and find the difference of it

 */

package com.kodnest.pratice_1;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter A value :");
		float a = scan.nextFloat();
		System.out.println("Enter B value :");
		float b=scan.nextFloat();
		System.out.println("The result is :"+(a-b));


	}
}
