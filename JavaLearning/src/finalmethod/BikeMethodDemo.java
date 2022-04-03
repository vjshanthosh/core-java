package finalmethod;

class Bike
{
	final void run()
	{
		System.out.println("Running");
	}
	
}

class Honda extends Bike
{
	/*void run() we cannot over ride final method
	{
		System.out.println("Honda");
	}*/
}




public class BikeMethodDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   Honda h= new Honda();
   h.run();
		
	}

}
