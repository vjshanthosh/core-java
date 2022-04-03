public class PermuteString {
	public static void main(String[] args) {
		String s = "abc";
		char t = ' ';
		char[] c = s.toCharArray();
		for(int i = 0; i < s.length(); ++i){
			for(int j = i; j < s.length(); ++j){
				t = c[i];
				c[i] = c[j];
				c[j] = t;
				for(int k = 0; k < s.length(); k++)
					System.out.print(c[k]);
				System.out.println();
			}
		}
	}
}