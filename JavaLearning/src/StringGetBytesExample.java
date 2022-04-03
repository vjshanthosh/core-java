
public class StringGetBytesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Shanthosh sivam";
		byte[] b = s.getBytes();
		for(int i = 0; i < b.length; i++)
			System.out.println(b[i]);
	}

}
