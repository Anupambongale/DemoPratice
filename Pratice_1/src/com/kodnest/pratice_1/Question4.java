//WAJP to perform a calculator application
//that perform + , - , * ,Finding Quotient And reminder 
//for 2 number values using method without parameter with return type 

package com.kodnest.pratice_1;

import java.util.Scanner;

public class Question4 {
	
	public static void main(String[] args)
	{
		String calculator=calculator();
		System.out.println(calculator);
//		int addition = addition();
//		int subtraction = subtraction();
//		int multiplication = multiplication();
//		int quotient = quotient();
//		int reminder = reminder();
//		System.out.println("The Addition  is :"+addition);
//		System.out.println("The subtraction  is :"+subtraction);
//		System.out.println("The multiplication  is :"+multiplication);
//		System.out.println("The quotient  is :"+quotient);
//		System.out.println("The reminder  is :"+reminder);
	}
	 static String calculator()
	 {
		    Scanner scan = new Scanner(System.in);
		    System.out.println("User! Please Enter a Value :");
	        int a= scan.nextInt();
		    System.out.println("User! Please Enter b Value :");
	        int b= scan.nextInt();
	        String result =" The Addition is :" +(a+b) + " \n "+"The subtraction is :" +  (a-b)+" \n "+ "The multiplication is :" +(a*b)+" \n "+ "The quotient is :" +(a/b)+" \n "+ "The Reminder is :" +a%b;
            return result;
	 }
//     static int addition() //with return type
//	{
//		Scanner scan = new Scanner(System.in);
//	    System.out.println("User! Please Enter a Value :");
//        int a= scan.nextInt();
//	    System.out.println("User! Please Enter b Value :");
//        int b= scan.nextInt();
//        int result = a+b;
//        return result;
//	}
//     
//     static int subtraction() //with return type
// 	{
// 		Scanner scan = new Scanner(System.in);
// 	    System.out.println("User! Please Enter a Value :");
//         int a= scan.nextInt();
// 	    System.out.println("User! Please Enter b Value :");
//         int b= scan.nextInt();
//         int result = a-b;
//         return result;
// 	}
//     
//     static int multiplication() //with return type
// 	{
// 		Scanner scan = new Scanner(System.in);
// 	    System.out.println("User! Please Enter a Value :");
//         int a= scan.nextInt();
// 	    System.out.println("User! Please Enter b Value :");
//         int b= scan.nextInt();
//         int result = a*b;
//         return result;
// 	}
//     
//     static int quotient() //with return type
// 	{
// 		Scanner scan = new Scanner(System.in);
// 	    System.out.println("User! Please Enter a Value :");
//         int a= scan.nextInt();
// 	    System.out.println("User! Please Enter b Value :");
//         int b= scan.nextInt();
//         int result = a/b;
//         return result;
// 	}
//     
//     static int reminder() //with return type
// 	{
// 		Scanner scan = new Scanner(System.in);
// 	    System.out.println("User! Please Enter a Value :");
//         int a= scan.nextInt();
// 	    System.out.println("User! Please Enter b Value :");
//         int b= scan.nextInt();
//         int result = a%b;
//         return result;
// 	}

}
