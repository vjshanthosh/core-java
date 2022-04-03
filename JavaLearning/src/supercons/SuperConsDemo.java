package supercons;

class Person
{
	int id;
	String name;
	
	Person(int id,String name) //constructor
	{
		this.id=id;
		this.name=name;
	}
}

class Employee extends Person
{
	 
float salary;	
Employee(int id,String name,float salary){
	super(id,name); //passing value to immediate parent cons using super keyword
	this.salary=salary;
	
}
	
	

void display()
{
	System.out.println(id +" "+ name+ " "+salary);
}

}



public class SuperConsDemo {

	public static void main(String[] args) {

			
		Employee e= new Employee(123,"sam",10000);
		e.display();
		
	}

}
