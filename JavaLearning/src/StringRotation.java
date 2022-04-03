public class StringRotation {
	public static void main(String[] args) {
		String a = "abcde", b = "deabc";
		if(a.length() != b.length())
			System.out.println("Second string is not the rotation of first string");
		else{
			a = a.concat(a);
			if(a.indexOf(b) != -1)
				System.out.println("Second string is the rotation of first string");
			else
				System.out.println("Second string is not the rotation of first string");
		}
	}
}