package exceptionhandling;

public class NullPointerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= null;
try{
		System.out.println(s);
		
		System.out.println(s.length());
}
catch(Exception e)
{
	System.out.println("Null Pointer Exception");
}

	}

}
