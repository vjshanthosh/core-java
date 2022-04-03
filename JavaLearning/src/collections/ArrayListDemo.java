package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1= new String("Shanthosh");
		String s2= new String("Sam");
		String s3= new String("Ram");
		
		//Collection
		//List
		//Set
		//Map
		//List
		//ArrayList - Today arraylist we have  seen example
		//LinkedList
		//Vector
		//Stack
		
		//Set
		//HashSet
		//LinkedHashSet
		//TreeSet
		
		
		//Map
		//HashMap
		//LinkedHashMap
		//TreeMap
		
		//HashTable releted Map
		
		
		
		List<String> strList= new ArrayList<String>(); //search fast insert deleteslow
		strList.add(s1);
		strList.add(s2);
		strList.add(s3);
		
		for(String str:strList)
		{
			System.out.println(str);
		}
		
		
		
		

	}

}
