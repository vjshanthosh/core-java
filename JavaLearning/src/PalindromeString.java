
public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcba";
		boolean f = true;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) != s.charAt(s.length() - i - 1))
				f = false;
				break;
		}
		System.out.println((f == true)? "Palindrome string" : "Not palindrome string");
	}

}
