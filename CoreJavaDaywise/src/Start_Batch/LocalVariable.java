package Start_Batch;

class Calculator
{
	void add()
	{
		int a=100;
		int b=20;
		int c=a+b;
		System.out.println(c);
		System.out.println("======");
	}
	void sub()
	{
		int a=100;
		int b=20;
		int sub=a-b;
		System.out.println(sub);
		System.out.println("========");
	}
	void mul()
	{
		int a=10;
		int b=20;
		int mul=a*b;
		System.out.println(mul);
		System.out.println("===========");
	}
	void div()
	{
		int a=100;
		int b=20;
		int c=a/b;
		System.out.println(c);
	}
}
public class LocalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		c.add();
		c.sub();
		c.mul();
		c.div();

	}

}
