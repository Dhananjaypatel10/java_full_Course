package com.desitination.Basic.Patterns;
import java.util.Scanner;
public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int s=0;s<num-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

		
	}

}
