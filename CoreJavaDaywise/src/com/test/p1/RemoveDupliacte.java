package com.test.p1;
import java.util.*;
public class RemoveDupliacte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {21,35,35,47,47,56};
		HashSet<Integer> hs=new HashSet<>();
		for(int i:arr)
		{
			if(hs.add(i))
			{
				System.out.print(i+" ");
			}
		}
		

	}

}
