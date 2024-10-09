package com.destinatio.BascisArray;
import java.util.Scanner;
public class ArrayProgram3 {
    int arr[][];
    int cls;
     Scanner sc=new Scanner(System.in);
    void CreateArray(int n)
    {
    	cls=n;
    	arr=new int[n][];
    	System.out.println("Collecting Student count for each student:");
    	for(int i=0;i<arr.length;i++)
    	{
    		System.out.println("enter the Student count inside class no:"+(i+1));
    		int stu=sc.nextInt();
    		arr[i]=new int[stu];
    	}
    	System.out.println("Array is created Successfully");
    	System.out.println("=====");
    }
    void addData()
    {
    	System.out.println("collecting array data:");
    	for(int i=0;i<arr.length;i++)
    	{
    		System.out.println("Inside class no:"+(i+1));
    		for(int j=0;j<arr[i].length;j++)
    		{
    			System.out.println("enter the marks of student no:"+(j+1));
    			arr[i][j]=sc.nextInt();
    		}
    	}
    	System.out.println("marks successfuly collected");
    	System.out.println("======");
    }
    void Display()
    {
    	System.out.println("Display array Data:");
    	for(int i=0;i<arr.length;i++)
    	{
    		System.out.println("Inside class no:"+(i+1));
    		for(int j=0;j<arr[i].length;j++)
    		{
    			System.out.println("the marks of student no:"+(j+1)+" is:"+arr[i][j]);
    		}
    	}
    }
    	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayProgram3 a1=new ArrayProgram3();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter class count:");
		int cls=sc.nextInt();
	   a1.CreateArray(cls);
	   a1.addData();
	   a1.Display();
		

	}

}
