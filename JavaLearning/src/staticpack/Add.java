package staticpack;

import java.util.Scanner;

public class Add {
	
	static void add(){
		System.out.println("Enter 2 numbers");
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		Scanner s2 = new Scanner(System.in);
		int b = s2.nextInt();
		System.out.println("a + b = " + (a + b));
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
	}

}