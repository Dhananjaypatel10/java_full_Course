package com.desitination.Basic.Patterns;
/*
 15
 14 13
 12 11 10
 9 8 7 6  
 5 4 4 2 1
 
 */
import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter your input");
		int num=sc.nextInt();
		int count=num*(num+1)/2;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count);
				System.out.print(" ");
				count--;
			}
			System.out.println();

	}

	}
}
