package instanceblock;



class Bike
{
	
	int speed;
	
	Bike()
	{
		System.out.println(speed);
	}
	
	
	
	{ // instance block
		speed=400;
	}
}

public class InstanceBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike b = new Bike();

	}

}
