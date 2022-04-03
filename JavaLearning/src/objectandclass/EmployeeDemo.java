package objectandclass;
class Employee{
	int employeeId;
	String employeeName;
}
public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.employeeId = 35869;
		e.employeeName = "Shanthosh";
		System.out.println(e.employeeId);
		System.out.println(e.employeeName);
	}

}