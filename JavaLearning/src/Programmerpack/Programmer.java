package Programmerpack;

class Employee{
	int salary = 40000;
}

class Programmer extends Employee{
	int bonus = 10000;
	public static void main (String args[])
	{
		Programmer p = new Programmer();
		System.out.println("programmer salary is: " + p.salary);
		System.out.println("programmer bonus is: " + p.bonus);
	}
}