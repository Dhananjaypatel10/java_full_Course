package com.desitination.Basic.Patterns;

public class Table {
	 static  String cllg="GGU";
	   int y=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Table t1=new Table();
//		t1.cllg="ITER";
//		t1.y=999;
//		Table t2 =new Table();
//		System.out.print(t2.cllg+" "+t2.y);
//		
        String str="madam";
        String newstr="";
        boolean flag=false;
        for(int i=0;i<str.length();i++)
        {
        	for(int j=0;j<newstr.length();j++)
        	{
        		if(newstr.charAt(j)==str.charAt(i))
        		{
        			flag=true;
        			break;
        		}
        	}
        	if(!flag)
        	{
        		newstr+=str.charAt(i);
        	}
        }
        System.out.print(newstr);
        
	  
	  
		
	}

}
