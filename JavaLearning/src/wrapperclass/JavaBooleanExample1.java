package wrapperclass;

public class JavaBooleanExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Boolean b1= true; //wrapper class// 100%
		boolean b2= true;
		
	    Boolean b3=b1.booleanValue();
		System.out.println(b3);
		
		
		
		int val=Boolean.compare(b1, b2);
		System.out.println(val);
		
		
		
		
		Boolean val2 = Boolean.logicalAnd(b1,b2); 
		System.out.println(val2);
		int i=100;
		short s=10;
		Short s1=(short) i; //autoboxing explicit conversion
		
		System.out.println(s);
		System.out.println(s1);*/
		
		byte b=10;  
		short s=20;  
		int i=30;  
		long l=40;  
		float f=50.0F;  
		double d=60.0D;  
		char c='a';  
		boolean b2=true;  
		
		Byte byteobj=b;  
		Short shortobj=s;  
		Integer intobj=i;  
		Long longobj=l;  
		Float floatobj=f;  
		Double doubleobj=d;  
		Character charobj=c;  
		Boolean boolobj=b2;  
		
		
		System.out.println("---Printing object values---");  
		System.out.println("Byte object: "+byteobj);  
		System.out.println("Short object: "+shortobj);  
		System.out.println("Integer object: "+intobj);  
		System.out.println("Long object: "+longobj);  
		System.out.println("Float object: "+floatobj);  
		System.out.println("Double object: "+doubleobj);  
		System.out.println("Character object: "+charobj);  
		System.out.println("Boolean object: "+boolobj); 

	}

}
