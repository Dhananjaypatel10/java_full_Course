package com.desitination.Basic.Patterns;
/*
 25 24 23 22 21
 20 19 18 17 16
 15 14 13 12 11
 10 9 8 7 6
 5 4 3 2 1
 */
import java.util.Scanner;
public class Patterns7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your value::");
		int num=sc.nextInt();
		int count=num*num;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num;j++)
			{
				System.out.print(count+"	");
				count--;
				
			}
			System.out.println();
		}

	}

}
