package controlstatement;

public class ControlDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int  a=100;
   
		//if 
   if(a==100)
   {
	   System.out.println("The value of a is 100");
   }
		
		//if else
	if(a==100)
	{
		 System.out.println("The value of a is 100");	
	}else
	{
		 System.out.println("The value of a not equal to 100");
	}
		
		//if else if else
		a=200;
	if(a==100)
	{
		System.out.println("The value of a is 100");
	}else if (a >100)
	{
		System.out.println("The value of a greater ");
	}else
	{
		System.out.println("The value of a is less than 100");
	}
	
	
		//nested if
		int age=20;
		int wt=15;
	if(age >=20)
	{
		if(wt <=40 && wt >=35)
		{
			System.out.println("YOU ARE FIT");
		}
	}
	
		
	}

}
