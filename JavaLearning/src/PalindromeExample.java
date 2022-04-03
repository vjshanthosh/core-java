public class PalindromeExample {
	public static void main(String[] args) {
		int n = 454, r = 0, d = 0, p = 1;
		for(int i = n; i > 0; i /= 10)
			d++;
		for(; d > 1; d--)
			p *= 10;
		for(int i = n; i > 0; i /= 10){
			r = r + ((i % 10) * p);
			p /= 10;
		}
		if(n == r)
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");
	}
}