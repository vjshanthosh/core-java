package methodoverride;

class A
{
	void print()
	{
		System.out.println("Print A");
	}
}


class B extends A
{
	void print()
	{
		System.out.println("Print B");
	
	}
}
public class MethodOverrideDemo {
	
	
	public static void main(String args[])
	{
		B b=new B();// method overriding
		b.print();
		
		
		A a= new A();
		a.print();
		
		
		
		A aa= new B();
		aa.print();
		
	}
	

}
