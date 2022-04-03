package stringpack;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char[] ch={'s','h','a','n','t','h','o','s','h'};
		
		String str= new String(ch);// heap memory + String constant pool
		
		String str2= new String("Shanthosh");// heap memory + String constant pool
		
		String str3="shanthosh"; //String constant pool
		
		
		System.out.println(str);
		
		System.out.println(str2);
		
		System.out.println(str3);
		
		
		
		
		
		

	}

}
