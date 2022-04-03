
public class StringGetCharsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello javatpoint";
		char[] c = new char[10];
		try{
			s.getChars(6, 16, c, 0);
			System.out.println(c);
		}catch(Exception ex){System.out.println(ex);}
	}

}