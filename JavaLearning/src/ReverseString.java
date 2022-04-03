
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Shanthosh";
		System.out.println("Original String is: " + s);
		System.out.print("Reverse String is: ");
		for(int i = s.length() - 1; i >= 0; i--)
			System.out.print(s.charAt(i));
	}

}
