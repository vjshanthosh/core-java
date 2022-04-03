package objectandclasscons;
class Student
{
	int studentId; //default value 0
	String studentName; //default value null
	
	
	Student(int studentId,String studentName )//constructor should be same as class name
	{
      this.studentId=studentId;
      this.studentName=studentName;
	}
	
	void display()
	{
		System.out.println(studentId);
		System.out.println(studentName);
	}
	
	
}


public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student s= new Student(456,"John");
     
      s.display();
		
		
	}

}

