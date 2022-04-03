package objectandclassmethod;

class Student
{
	int studentId;
	String studentName;
	
	
	//creating method
	void insertRecord(int id,String name)
	{
		studentId	=id;
		studentName=name;
	}
	
	void dispaly()
	{
		System.out.println(studentId);
		System.out.println(studentName);
	}
	
	
}
public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student s=new Student();
		s.insertRecord(123, "Santhosh");//calling method using object
		s.dispaly();
	}

}
