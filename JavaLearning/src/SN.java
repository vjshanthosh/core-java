import java.util.Scanner;
public class SN {
	public static void main(String[] args) {
		System.out.print("Enter a number to check: ");
		Scanner i = new Scanner(System.in);
		int n = i.nextInt(), a = 0, m = 1;
		for(int t = n; t > 0; t /= 10)
			a = a + (t % 10);
		for(int t = n; t > 0; t /= 10)
			m = m * (t % 10);
		System.out.println((a == m)? "It is Spy number" : "It is not a spy number");
		i.close();
	}
	
}