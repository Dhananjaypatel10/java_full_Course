package com.destinatio.BascisArray;

import java.util.Scanner;

public class ArrayProgram5 {
	String  arr[][][];
    int cllg;
    int cls;
     Scanner sc=new Scanner(System.in);
    void CreateArray(int n)
    {
    	cllg=n;
    	//cls=m;
    	arr=new String[cllg][][];
//    	System.out.println("Collecting class count:");
//    	for(int i=0;i<arr.length;i++)
//    	{
//    		System.out.println("enter inside cllg  no:"+(i+1));
//    		int cls=sc.nextInt();
//    		arr[i]=new int[cls][];
//    	}
    	//collection student count
//    	for(int i=0;i<arr.length;i++)
//    	{
//    		System.out.println("Inside college:"+(i+1));
//    		for(int j=0;j<arr[i].length;j++)
//    		{
//    			System.out.println("enter student count inside class:"+(j+1));
//    			int stu=sc.nextInt();
//    			arr[i][j]=sc.nextInt();
//    		}
//    	}
    	System.out.println("Array is created Successfully");
    	System.out.println("=====");
    }
    void addData()
    {
    	System.out.println("collecting array data:");
    	for(int i=0;i<arr.length;i++)
    	{
    		System.out.println("Inside cllg no:"+(i+1));
    		System.out.println("enter the no of class");
    		int cls=sc.nextInt();
    		arr[i]=new String[cls][];
    		for(int j=0;j<arr[i].length;j++)
    		{
    			System.out.println("enter the no of student class:"+(j+1));
    			int stu=sc.nextInt();
    			arr[i][j]=new String[stu];
    			for(int k=0;k<arr[i][j].length;k++)
    			{
    				System.out.println("enter name of student:"+(k+1));
    				arr[i][j][k]=sc.next();
    			}
    		}
    	}
    	System.out.println(" successfuly collected");
    	System.out.println("======");
    }
    void Display()
    {
    	//System.out.println("Display array Data:");
    	for(int i=0;i<arr.length;i++)
    	{
    		System.out.println("Inside class no:"+(i+1));
    		for(int j=0;j<arr[i].length;j++)
    		{
    			System.out.println("the name of student no:"+(j+1));
    			for(int k=0;k<arr[i][j].length;k++)
    			{
    				System.out.println("student:"+(k+1)+"name="+arr[i][j][k]);
    			}
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayProgram5 a4=new ArrayProgram5();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter college");
		int n=sc.nextInt();
		a4.CreateArray(n);
		a4.addData();
		a4.Display();

	}

}
