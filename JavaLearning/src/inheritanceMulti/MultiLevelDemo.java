package inheritanceMulti;

class Animal
{
	void eat()
	{
		System.out.print("Eating");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking");
	}
}
class BabyDog extends Dog
{
	void weep()
	{

		System.out.println("weeping");	
	}
	
}

public class MultiLevelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BabyDog b= new BabyDog();
		b.weep();
		b.bark();
		b.eat();
		
	}

}
