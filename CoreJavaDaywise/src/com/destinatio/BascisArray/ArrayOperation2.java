package com.destinatio.BascisArray;
import java.util.Scanner;
public class ArrayOperation2 {
	int arr[][];
	int cls;
	int stu;
	void create(int n,int m)
	{
		cls=n;
		stu=m;
		arr=new int[n][m];
		System.out.println("Array is created successfully");
		System.out.println("========");
		
	}
	void addData()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<cls;i++)
		{
			System.out.println("Inside class No:"+(i+1));
			for(int j=0;j<stu;j++)
			{
				System.out.println("enter the marks of student no :"+(j+1));
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.print("Marks successfully collected");
		
	}
	void display()
	{
		System.out.println("Display Array Data");
		for(int i=0;i<cls;i++)
		{
			System.out.println("Inside class no:"+(i+1));
			for(int j=0;j<stu;j++)
			{
				System.out.println("enter the marks of student:"+(j+1)+" is:"+arr[i][j]);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOperation2 ao2=new ArrayOperation2();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter class count:");
		int cls=sc.nextInt();
		System.out.println(" enter the student count:");
		int stu=sc.nextInt();
		ao2.create(cls,stu);
		ao2.addData();
		ao2.display();
		

	}

}
