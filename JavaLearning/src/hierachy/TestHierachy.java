package hierachy;

class Animal{

	void eat()
	{
		System.out.println("Eating");
	}
}


class Dog extends Animal
{
	void bark()
	{
		System.out.println("barking");
	}
}

class Cat extends Animal
{
	void meow()
	{
		System.out.println("Meowing");
	}
}

/*
class A
{
	
}
class B
{
	
	
	
}
class C extends A,B // Not allowed to achieve this we will go for interface
*/

public class TestHierachy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dogObject =new Dog();
		dogObject.bark();
		dogObject.eat();
		
		
		Cat catObj = new Cat();
		catObj.meow();
		catObj.eat();
		//dogObject.meow();//erro
		
	}

}
