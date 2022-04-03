package supermethodpack;

class Animal
{
	void bark()
	{
		System.out.println("Eating");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking");
		super.bark();
	}
}

public class SuperMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d = new Dog();
		d.bark();
		
		
	}

}
