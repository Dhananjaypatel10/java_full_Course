package com.desitination.Basic.Patterns;
/*
 # # # # #
 # # # # #
 # # # # #
 # # # # #
 # # # # #
 
 */
import java.util.Scanner;
public class Patterns3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of Symbols:");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
		 for(int j=1;j<=num;j++)
		 {
			 System.out.print("# ");
		 }
		 System.out.println();
		}
		

	}

}
