class A{
	void a(int b, int c){
		System.out.println(b + c);
	}
	void a(char b, char c, char d){
		System.out.println(b +" "+ c +" "+ d);
	}
}
public class overload {

	public static void main(String[] args) {
		A a = new A();
		a.a('v', 's', 'a');
	}

}
