package com.destinatio.BascisArray;
import java.util.Scanner;
public class ArrayOperation1 {
	int arr[];
	int size;
	void createArray(int n)
	{
		size=n;
		arr=new int[n];
		System.out.println("Array is created Succesfully");
		System.out.println("=========");
	}
	void addData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Collecting array data:");
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the marks of student no:"+(i+1));
			arr[i]=sc.nextInt();
		}
		System.out.println("=============");
	}
		void display()
		{
			for(int i=0;i<size;i++)
			{
				//System.out.println("display the marks:");
				System.out.println("Marks of student no:"+(i+1)+" is:"+arr[i]);
			}
		}
		
	public static void main(String[] args) {                                       
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int n=sc.nextInt();
		ArrayOperation1 ao1=new ArrayOperation1();
		ao1.createArray(n);
		ao1.addData();
		ao1.display();
		

	}

}
