package UniversalPattern;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print A
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		//int n = 11;
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num;j++)
            {
            	if((j==0||i==0||i==num-1)&& j< num-1)
            	{
            		System.out.print("#");
            	}
            	else if(j==num-1 && i!=0 && i!=num-1)
            	{
            		System.out.print("#");
            	}
            	else
            	{
            		System.out.print(" ");
            	}
            }
            System.out.println();

		}
		
	}

}
