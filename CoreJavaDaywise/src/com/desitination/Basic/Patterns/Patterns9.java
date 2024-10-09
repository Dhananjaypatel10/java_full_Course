package com.desitination.Basic.Patterns;
/*
 ******
 *    *
 *    *
 *    *
 ******
 Hollow Rectangle
 */
import java.util.Scanner;
public class Patterns9 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your Rows and Columns");
//		int n=sc.nextInt();
//		int m=sc.nextInt();
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=m;j++)
//			{
//				if(i==1||j==1||i==n||j==m)
//				{
//				System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
//
//	}
//
//}

/*
 * 
 **
 ***
 ****
 *****
 Half Pyramid
 */
	

//public static void main(String [] args)
//{
//	Scanner sc=new Scanner(System.in);
//	System.out.print("enter your value");
//	int num=sc.nextInt();
//	 for(int i=1;i<=num;i++)
//     {
//         for(int j=1;j<=i;j++)
//         {
//             System.out.print("*");
//         }
//         System.out.println();
//     }
	
/*
 ******
 ****
 ***
 **
 *
 Inverted half Pyramid
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value:");
		int num=sc.nextInt();
		for(int i=num;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

