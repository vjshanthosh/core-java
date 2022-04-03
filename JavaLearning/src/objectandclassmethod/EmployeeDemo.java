package objectandclassmethod;
class Employee{
	int employeeId;
	String employeeName;
	void a(int id, String name){
		employeeId = id;
		employeeName = name;
	}
	void b(){
		System.out.println(employeeId);
		System.out.println(employeeName);
	}
}
public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.a(2022, "abcd");
		e.b();
	}

}
