package exceptionhandling;

public class ArrayIndexException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[2];
		
		//0,1
		try
		{
		a[2]=30;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("Array Index out of bounds Exception");
		}
		
		
		System.out.println();

	}

}
