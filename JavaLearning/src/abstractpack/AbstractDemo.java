package abstractpack;



abstract class Bike
{
	abstract void run();//abtract method no implementation in abstract class
}

class Honda extends Bike
{

	@Override
	void run() {
		System.out.println("I am running");
		
	}
	
}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Honda h= new Honda();
		h.run();

	}

}
