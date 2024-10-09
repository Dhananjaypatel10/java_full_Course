package com.desitination.Basic.Patterns;
import java.util.Scanner;
public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=2*num;i++)
		{
			int col=i>num?2*num-i:i;
			int spaces=num-col;
			for(int s=0;s<=spaces;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=col;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
