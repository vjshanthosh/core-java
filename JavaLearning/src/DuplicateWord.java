public class DuplicateWord {
	public static void main(String[] args) {
		String s = "Big black bug bit a big black dog on his big black nose";
		s = s.toLowerCase();
		String p[] = s.split(" ");
		System.out.println("Duplicate words in the string are:");
		for(int i = 0; i < p.length; i++){
			for(int j = i + 1; j < p.length; j++){
				if(p[i] == p[j]){
					System.out.println(p[i] + " " + p[j]);
					System.out.println(p[j]);
					s = s.replace(p[j], " ");
				}
			}
		}
	}
}