package com.desitination.Basic.Patterns;
/*
 # # # # # %
 # # # # # % %
 # # # # # % % %
 # # # # # % % % %
 # # # # # % % % % %
 */

import java.util.Scanner;


public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter your input");
		int num=sc.nextInt();
		//int count=num*(num+1)/2;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num;j++)
			{
			  System.out.print("# ");
			  
			}
			for(int j=1;j<=i;j++)
			{
			System.out.print("% ");
			}
			System.out.println();

	}

}
}
