package methodoverloading;

class Sum
{
	void add(int a,int b)
	{
		System.out.print("The sum "+(a+b));
	}
	void add(int a,int b,int c)//overloaded method
	{
		System.out.print("The sum "+(a+b+c));
	}
	
}


public class MethodOverLoadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sum s= new Sum();
		s.add(12, 12);
		s.add(12, 12,12);

	}

}
