package Programmerpack;

class Animal{
	String name;
	public void eat(){
		System.out.println("I can eat");
	}
}

class Dog extends Animal{
	public void display(){
		System.out.println("My name is " + name);
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog labrador = new Dog();
		labrador.name = "Rohu";
		labrador.display();
		labrador.eat();
	}

}
