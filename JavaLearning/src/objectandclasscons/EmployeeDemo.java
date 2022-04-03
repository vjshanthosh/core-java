package objectandclasscons;

class Employee{
	int employeeId;
	String employeeName;
	Employee(int employeeId, String employeeName){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	void display(){
		System.out.println(employeeId);
		System.out.println(employeeName);
	}
}


public class EmployeeDemo {

	public static void main(String[] args) {
		// TeODO Auto-generated method stub
		Employee e = new Employee(7371, "vjss");
		e.display();
	}

}
