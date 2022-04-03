package collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> vector= new Vector();
		

		vector.add("sam");
		vector.add("ram");
		
		
		for(String s:vector)
		{
			System.out.println(s);
		}
		
		
	}

}
