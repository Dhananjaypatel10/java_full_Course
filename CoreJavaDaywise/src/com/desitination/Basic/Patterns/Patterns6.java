package com.desitination.Basic.Patterns;
/*
 1 2 3 4 5 
 6 7 8 9 10
 11 12 13 14 15
 16 17 18 19 20
 21 22 23 24 25
 
 */
import java.util.Scanner;
public class Patterns6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your value:");
		int num=sc.nextInt();
		int count=1;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num;j++)
			{
				System.out.print(count+"	");
				count++;
			}
			System.out.println();
		}
		

	}

}
