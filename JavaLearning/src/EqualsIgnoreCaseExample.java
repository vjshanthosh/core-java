public class EqualsIgnoreCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "javatpoint";
		String s2 = "javatpoint";
		String s3 = "JAVATPOINT";
		String s4 = "python";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
	}

}