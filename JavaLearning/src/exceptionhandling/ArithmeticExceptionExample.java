package exceptionhandling;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100;
		int b=200;
		try{
		int c=a/10;
System.out.println("output "+c);
		}catch(ArithmeticException e)
		{
			System.out.println("Arith exception occured");
		}
		
		int d=b*10;
		
		

	}

}
