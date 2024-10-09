package com.desitination.Basic.Patterns;
/*
 - - - - - # # # # #
 - - - - # # # # #
 - - - # # # # # 
 - - # # # # #
 - # # # # #
 */
import java.util.Scanner;
public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter your input");
		int num=sc.nextInt();
		//int count=num*(num+1)/2;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num-i+1;j++)
			{
			  System.out.print("- ");
			}
			for(int j=1;j<=num;j++)
			{
				System.out.print("# ");
			}
			System.out.println();

	}

	}
}
