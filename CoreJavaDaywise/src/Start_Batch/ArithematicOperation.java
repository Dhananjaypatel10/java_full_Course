package Start_Batch;

public class ArithematicOperation {
	
	void add(int a,int b)
	{
		int res=a+b;
		System.out.println("Addition is:"+res);
		System.out.println("======");
	}
	void Sub(int a,int b)
	{
		int res=a-b;
		System.out.println("Substraction is:"+res);
		System.out.println("=======");
	}
	void mul(int a,int b)
	{
		int res=a*b;
		System.out.println("Multiplication is:"+res);
		System.out.println("========");
	}
	void div(int a,int b)
	{
		int res=a/b;
		System.out.println("Division is:"+res);
		System.out.println("========");
	}
	void Mod(int a,int b)
	{
		int res=a%b;
		System.out.println("Modulas is:"+res);
		System.out.println("==========");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		int b=50;
		ArithematicOperation ao=new ArithematicOperation();
		ao.add(a, b);
		ao.Sub(a, b);
		ao.mul(a, b);
		ao.div(a,b);
		ao.Mod(a, b);

	}

}
