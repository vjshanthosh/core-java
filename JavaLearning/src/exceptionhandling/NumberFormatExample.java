package exceptionhandling;

public class NumberFormatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
	String s="Shanthosh";
	
		int i= Integer.valueOf(s);
		System.out.println(s);
		}
		catch(Exception e)
		{
			System.out.println("Number format execption occured");
		}
		
		

	}

}
