package inheritance;


class Animal
{
	
	void eat()
	{
		System.out.println("I am eating");
	}
}


class Dog extends Animal  // the object of dog can access the Animal variable and method
{
	void bark()
	{
		System.out.println("Barking");
	}
	
}

public class SingleInheritance {

	public static void main(String[] args) {
		
		Dog d=new Dog(); //Child can access parent
		d.bark();        // parent cannot access child
		//((Animal) d).eat();
		
		


	}

}
