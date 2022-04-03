
public class IndexOfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is index of example";
		int i1 = s.indexOf("is");
		int i2 = s.indexOf("index");
		System.out.println(i1 + " " + i2);
		int i3 = s.indexOf("is", 4);
		System.out.println(i3);
		int i4 = s.indexOf('s');
		System.out.println(i4);
	}

}
