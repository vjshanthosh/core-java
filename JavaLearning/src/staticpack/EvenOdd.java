package staticpack;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number: ");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println((a % 2 == 0)? "Even" : "Odd");
		b();
	}
	static void b(){
		int a = 5;
		System.out.println(a * a);
	}

}
