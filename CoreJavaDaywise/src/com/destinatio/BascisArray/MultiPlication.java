package com.destinatio.BascisArray;
import java.util.Scanner;
public class MultiPlication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int cls=sc.nextInt();
		int stu=sc.nextInt();
		int arr[][]=new int[cls][stu];
		for(int i=0;i<cls;i++)
		{
			for(int j=0;j<stu;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=0;j<arr[0].length;j++)
        	{
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }
        int cls1=sc.nextInt();
        int stu1=sc.nextInt();
        int arr1[][]=new int[cls1][stu1];
        for(int i=0;i<cls1;i++)
        {
        	for(int j=0;j<stu1;j++)
        	{
        		arr1[i][j]=sc.nextInt();
        	}
        }
        for(int i=0;i<arr1.length;i++)
        {
        	for(int j=0;j<arr1[0].length;j++)
        	{
        		arr1[i][j]=sc.nextInt();
        	}
        }
//        if(cls1!=stu1)
//        {
//        	System.out.println("Invalid input");
//        	return;
//        }
//        int prd[][]=new int[cls][stu1];
//        for(int i=0;i<prd.length;i++)
//        {
//        	for(int j=0;j<prd[i].length;j++)
//        	{
//        		for(int k=0;k<cls;k++)
//        		{
//        			prd[i][j]=arr[i][k]*arr1[k][j];
//        		}
//        	}
//        }
//        for(int i=0;i<prd.length;i++)
//        {
//        	for(int j=0;j<prd[i].length;j++)
//        	{
//        		System.out.print(prd[i][j]+" ");
//        	}
//        }
//        System.out.println();
	}

}
