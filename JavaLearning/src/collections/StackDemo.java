package collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stk= new Stack();
		
		stk.push("sam");
		stk.push("Ram");
		
		
		for(String s: stk)
		{
			System.out.println(s);
		}
		
		stk.pop();

		for(String s: stk)
		{
			System.out.println(s);
		}

	}

}
