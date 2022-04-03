package helloworld;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int i = 20;
		System.out.println(i + i);
        
		Scanner s= new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Enter a value");
		a=s.nextInt();
		
		

		System.out.println("Enter b value");
		b=s.nextInt();
		
		c=a+b;
		
		System.out.println("sum of a and b "+ c);
		
		

	}

}
