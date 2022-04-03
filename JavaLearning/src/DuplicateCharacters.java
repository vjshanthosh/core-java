public class DuplicateCharacters {
	public static void main(String[] args) {
		String s = "shanthosh sivam vijayakumar";
		System.out.println("Duplicate characters in the string are: ");
		for(int i = 0; i < s.length(); i++)
			for(int j = i + 1; j < s.length(); j++)
				if(s.charAt(j) == s.charAt(i) && s.charAt(i) != ' '){
					System.out.println(s.charAt(j));
					s = s.replace(s.charAt(j), ' ');
				}
	}
}