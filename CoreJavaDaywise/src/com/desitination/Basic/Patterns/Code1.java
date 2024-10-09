package com.desitination.Basic.Patterns;

public class Code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Implixit type casting
		byte b=25;
		short s=b;
		int i=s;
		long l=i;
		System.out.println(l);
		
		System.out.println("-----");
		//explicit type casting
		long l1=100l;
		int i1=(int)l1;
		short s1=(short)i1;
		byte b1=(byte)s1;
		System.out.println(b1);
		System.out.println("----");
		//byte range -128 to 127
		short s2=130;
		byte b2=(byte)s2;
		System.out.println(b2);
		

	}

}
