public class FrequencyOfCharacters {
	public static void main(String[] args) {
		String s = "shanthosh";
		int c = 0;
		for(int i = 0; i < s.length(); i++){
			for(int j = i; j < s.length(); j++){
				if(s.charAt(j) == s.charAt(i) && s.charAt(i) != ' '){
					c++;
					s = s.replace(s.charAt(j), ' ');
					System.out.println(s.charAt(i) + " " + c);
				}
				if(j == s.length() - 1)
					c = 0;
			}
		}
	}
}