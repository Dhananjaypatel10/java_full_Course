package UniversalPattern;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
				if(i==0  || i==num-1||j==0||j==num-1)
				{
					System.out.print("1 ");
				}
				else
				{
					System.out.print("2 ");
				}
			}
			System.out.println();
	}

	}
}
