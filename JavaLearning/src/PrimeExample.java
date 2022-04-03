import java.util.Scanner;
public class PrimeExample {
	public static void main(String[] args) {
		int n = 23;
		int f = 0;
		if(n == 0 || n == 1)
			f++;
		for(int i = 2; i <= n/2; ++i){
			if(n % i == 0)
				f++;
				break;
		}
		System.out.println((f == 0)? "Prime number" : "Not a prime number");
	}
}