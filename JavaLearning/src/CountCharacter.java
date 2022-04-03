
public class CountCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0;
		String a = "Shan thosh ";
		for(int i = 0; i < a.length(); i++)
			if(a.charAt(i) != ' ')
				c++;
		System.out.println(c);
	}


}
