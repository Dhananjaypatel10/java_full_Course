package Start_Batch;
class Dog{
	String name;
	String color;
	int cost;
	int age;
	String breed;
	
	void eat()
	{
		System.out.println(name+" Eats");
	}
	void walk()
	{
		System.out.println(name+" Walks");
	}
	void run()
	{
		System.out.println(name+" Runs");
	}

}
public class Test1 {

	public static void main(String[] args) {
		Dog d1=new Dog();
		System.out.println(d1.name);
		System.out.println(d1.color);
		System.out.println(d1.cost);
		System.out.println(d1.age);
		System.out.println(d1.breed);
		System.out.println("============");
		d1.name="Rocky";
		d1.color="Brown";
		d1.cost=6000;
		d1.age=4;
		d1.breed="GR";
		System.out.println(d1.name);
		System.out.println(d1.color);
		System.out.println(d1.cost);
		System.out.println(d1.age);
		System.out.println(d1.breed);
		System.out.println("============");
		d1.eat();
		d1.walk();
		d1.run();
		

	}

}
