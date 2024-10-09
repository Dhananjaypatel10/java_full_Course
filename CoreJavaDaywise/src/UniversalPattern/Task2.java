package UniversalPattern;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a=1;
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(a<10)
				{
					System.out.print("0"+a+" ");	
				}
				else {
					System.out.print(a+" ");
				}
				a++;
			}
			System.out.println("");

		}
		


	}

}
