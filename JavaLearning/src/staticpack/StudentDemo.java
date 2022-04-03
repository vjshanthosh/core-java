package staticpack;


class Student
{
	int studentId;
	String studentName;
	static String college;//1.static variable
	//2.static method
	//3.static block
	
	static //static block will be executed when class loaded into JVM for execution
	{//Java virtual machine Which is responbile to execute our program
		System.out.println("I am static block");
	}
	//method in a class
	static void display()
	{
		System.out.println("I am display method");
	}
	
}

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s =new Student();
		s.studentId=123456;
		s.studentName="sam123";
		Student.college="NIIT";//we can access static variable using the class name
		
		System.out.println(s.studentId);
		System.out.println(s.studentName);
		
		System.out.println(Student.college);

	    //How we call a method in java
		//we will use object to call a method
		//Here s is an object
		Student.display(); // Here we are calling a static method
		
	}

}
