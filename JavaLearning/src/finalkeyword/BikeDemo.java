package finalkeyword;

public class BikeDemo {
	
	final int speedLimit=90;
	
	void run()
	{
	//	speedLimit=400;  the final keyword value cannot be changed once its assigned
		System.out.println(speedLimit);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BikeDemo b= new BikeDemo();
		b.run();

	}

}
