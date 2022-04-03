package controlstatement;

public class SwitchDemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte n = 15;
		switch(n){
		case 20:
			System.out.println("n >= 20");
		break;
		case 10:
			System.out.println("n >= 10 and n < 20");
		break;
		default:
			System.out.println("n < 10");
		}

	}

}
