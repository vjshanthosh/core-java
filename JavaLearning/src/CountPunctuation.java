
public class CountPunctuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = ",.?:;'\"!";
		int c = 0;
		for(int i = 0; i < s.length(); i++)
			if(s.charAt(i) == ',' || s.charAt(i) == '.' || s.charAt(i) == '?' || s.charAt(i) == ':' || s.charAt(i) == ';' || s.charAt(i) == '\'' || s.charAt(i) == '"' || s.charAt(i) == '!')
				c++;
		System.out.println(c);
	}

}
