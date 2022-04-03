import java.util.Arrays;
public class Anagram {
	public static void main(String[] args) {
		String s1 = "Dog", s2 = "God", l1 = s1.toLowerCase() , l2 = s2.toLowerCase();
		char[] c1 = l1.toCharArray(), c2 = l2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println((Arrays.equals(c1, c2))? "Anagram" : "Not anagram");
	}
}