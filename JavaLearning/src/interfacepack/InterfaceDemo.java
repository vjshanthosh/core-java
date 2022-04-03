package interfacepack;


//to multiple inheritance

interface Printable
{
void print(); // no impl	
}

interface Drawable
{
void draw(); // no impl	
}

class X
{
	
}
class Y
{
	
}
class Z extends X//,Y  -- not allowed
{

}

class A implements Printable,Drawable
{

	@Override
	public void print() {
    System.out.println(" printing");		
	}

	@Override
	public void draw() {
    System.out.println("Drawing");		
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a =new A();
		a.print();
		a.draw();

	}

}
