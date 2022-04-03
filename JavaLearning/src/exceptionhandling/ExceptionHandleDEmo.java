package exceptionhandling;

public class ExceptionHandleDEmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int i = 5/0;// Arithmetic
			System.out.println(i);
			String s = null;
			System.out.println(s.length());// NullPointer
			int[] a = {1, 2, 3};
			System.out.println(a[3]);//ArrayIndex
			
			String str="Shanthosh";
			int ii=Integer.valueOf(str);//Number format execption
			
			
			//pwvmihtjkrgf[cdroep]
		}catch(Exception e){
			System.out.println("Exception");
		}
	}

}
