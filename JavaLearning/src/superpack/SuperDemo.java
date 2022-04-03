package superpack;


class Animal //Parend
{
	String color1="white";
}

class Dog extends Animal //Dog is a Animal
{
	String color="Black";
	
	void printColor()
	{
		System.out.println(color);
		System.out.println(super.color1);
	}
	
}


public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.printColor();
		

	}

}
