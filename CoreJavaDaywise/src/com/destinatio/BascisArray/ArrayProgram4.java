package com.destinatio.BascisArray;

import java.util.Scanner;

public class ArrayProgram4 {
	Scanner sc=new Scanner(System.in);
	String arr[][][];
	int college;
	int cls;
	int stu;
	void create(int n,int m,int o)
	{
		//Scanner sc=new Scanner(System.in);
//		college=n;
//		cls=m;
//		stu=o;
		arr=new String[m][n][o];
//		System.out.println("enter student no. of each class");
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(" inside college no:"+(i+1));
//			for(int j=0;j<arr[i].length;j++)
//			{
//				System.out.println("enter student Inside class room no:"+(j+1));
//				int stu=sc.nextInt();
//				arr[i][j]=new int[stu];
//			}
//		}
		System.out.println("Array is created :");
		System.out.println("=======");
		
		
	}
	void addData()
	{
		System.out.println("collecting array data");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Inside college No:"+(i+1));
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Inside the Class :"+(j+1));
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println("enter Students:"+(k+1)+":");
					arr[i][j][k]=sc.next();
				}
			}
		}
		System.out.print(" Collected Successfully");
		System.out.println("========");
		
	}
	void display()
	{
		System.out.println("Display Array Data");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Inside college no:"+(i+1));
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("enter class:"+(j+1));
			 	
			 for(int k=0;k<arr[i][j].length;k++)
			{
				System.out.println("the marks of student is:"+(k+1)+" is :"+arr[i][j][k]);
			}
		}
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayProgram4 a4=new ArrayProgram4();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number no of  college");
		int n=sc.nextInt();
		System.out.println("enter the number of clasees");
		int m=sc.nextInt();
		System.out.println("enter the number of student");
		int o=sc.nextInt();
		
		a4.create(n, m , o);
		a4.addData();
		a4.display();
		

	}

}
