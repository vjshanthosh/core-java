import java.util.Scanner;
public class changeCase {
	public static void main(String[] args) {
		System.out.print("Enter a string: ");
		Scanner i = new Scanner(System.in);
		String s = i.next();
		StringBuffer s1 = new StringBuffer(s);
		for(int i1 = 0; i1 < s.length(); i1++){
			if(Character.isLowerCase(s.charAt(i1)))
				s1.setCharAt(i1, Character.toUpperCase(s.charAt(i1)));
			else if(Character.isUpperCase(s.charAt(i1)))
				s1.setCharAt(i1, Character.toLowerCase(s.charAt(i1)));
		}
		System.out.println("String after case convertion: " + s1);
	}
}