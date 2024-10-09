package com.desitination.Basic.Patterns;
/*
 1 6 11 16 21
 2 7 12 17 22
 3 8 13 18 23
 4 9 14 19 24
 5 10 15 20 25
 */
import java.util.Scanner;
public class Patterns8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your value:");
		int count;
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			count=i;
			for(int j=1;j<=num;j++)
			{
				System.out.print(count+"	");
				count+=5;
			}
			System.out.println();
		}

	}

}
