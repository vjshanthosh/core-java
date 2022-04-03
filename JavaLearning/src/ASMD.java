import java.util.Scanner;
public class ASMD {
	public static void main(String[] args) {
		try{
			System.out.print("Enter the first number: ");
			Scanner s1 = new Scanner(System.in);
			float n1 = s1.nextFloat();
			System.out.print("Enter the second number: ");
			Scanner s3 = new Scanner(System.in);
			float n2 = s1.nextFloat();
			float a1 = n1 + n2, a2 = n1 - n2, a3 = n1 * n2; 
			System.out.println("n1 + n2 = " + a1);
			System.out.println("n1 - n2 = " + a2);
			System.out.println("n1 * n2 = " + a3);
			if(n2 != 0){
				float n4 = n1 / n2;
				System.out.println("n1 / n2 = " + n4);
			}else
				System.out.println("n1 / n2 = Error");
		}
		catch (Exception e){
			System.out.println("Invalid input");
		}
	}
}