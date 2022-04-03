import java.util.Scanner;
public class NN {
	public static void main(String[] args) {
		System.out.print("Enter a number to check: ");
		Scanner a = new Scanner(System.in);
		int b = a.nextInt(), c = b * b, d = 0;
		for(int e = c; e > 0; e /= 10)
			d = d + (e % 10);
		System.out.println((d == b)? "It is Neon number" : "It is not a neon number");
	}
}