package OverRide;

class A{
	void a(){
		System.out.println("A");
	}
}
class B extends A{
	void a(){
		System.out.println("B");
	}
}

public class OverRide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.a();
	}
}