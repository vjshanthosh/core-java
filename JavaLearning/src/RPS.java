import java.util.Random;
import java.util.Scanner;
public class RPS {
	public static void main(String[] args) {
		int won = 0, lost = 0;
		while(true){
			Random rn = new Random();
			int ci = rn.nextInt(3);
			System.out.print("Type r, p or s for rock paper sciscors: ");
			Scanner input = new Scanner(System.in);
			char ui = input.next().charAt(0);
			if(ui == 'r'){
				if(ci == 2){
					System.out.println("You won");
					won++;
				}else if(ci == 1){
					System.out.println("Computer won");
					lost++;
				}else
					System.out.println("Tie");
			}else if(ui == 'p'){
				if(ci == 0){
					System.out.println("You won");
					won++;
				}else if(ci == 2){
					System.out.println("Computer won");
					lost++;
				}else
					System.out.println("Tie");
			}else if(ui == 's'){
				if(ci == 1){
					System.out.println("You won");
					won++;
				}else if(ci == 0){
					System.out.println("Computer won");
					lost++;
				}else
					System.out.println("Tie");
			}else
				System.out.println("Invalid input");
			System.out.println("Your score is " + won + " Computer score is " + lost);
		}
	}
}