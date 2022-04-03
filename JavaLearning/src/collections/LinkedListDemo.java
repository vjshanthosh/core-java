package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1= new String("Sam");
		String str2= new String("Ram");
		String str3= new String("John");
		
		
		List<String> linkList = new LinkedList<String>();// insert delete fast
		
		linkList.add(str1);
		linkList.add(str2);
		linkList.add(str3);
		
		for(String s:linkList)
		{
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
