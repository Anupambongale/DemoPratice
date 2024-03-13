//WAJP to find Area of a Square Given Side Value of integer type
//using method with parameter and  with return type

package com.kodnest.pratice_1;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Side Value :");
		int side=scan.nextInt();
		int area=findArea(side);
		System.out.println("The Area is: "+area);
	}

	static int findArea(int side) {
		int area=side*side;
		return area;

	}

}
