package accessmodifier;

/*
 * 1. private
 * 2. default
 * 3. protected
 * 4. public 
 */

class A
{
 private int data=40;
 
 private void msg()
 {
	 System.out.println("Hello Java");
 }
}



public class PrivateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a= new A();
		//a.msg(); private method cannot be used in another class

	}

}
