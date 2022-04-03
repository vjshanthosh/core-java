package stringbuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		String s= new String(); //memory allocate  
		//123 ->Hello  goes to garbage
		//124 ->HelloWorld
		
		s="Hello";// immutable we cannot the value in memory
		
		s=s+"World";
		
		System.out.println(s);
		
		
		
		
		
		
		StringBuffer sb =new StringBuffer("Hello");//non-sync
		//123 ->Hello World
		
		
		sb.append("World"); //mutable means changable
		
		System.out.println(sb);
		
		
		
		StringBuilder sBuilder = new StringBuilder("Hello");//sync
		sBuilder.append("World"); 
		System.out.println(sBuilder);
		
		
		
		
		
		
	}

}
