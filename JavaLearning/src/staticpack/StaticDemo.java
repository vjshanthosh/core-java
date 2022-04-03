package staticpack;

class Employee{
	static int a = 1073;
	static{
		System.out.println("Shanthosh");
	}
	static void b(){
		System.out.println(a * 10);
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Employee.a);
		Employee.b();
	}

}
