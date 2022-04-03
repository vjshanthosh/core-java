public class SunnyNumber {
	public static void main(String[] args) {
		float n = 99F;
		int s = 0;
		for(float i = 1; i <= (n + 1); i++){
			if(n / i == i){
				s++;
				break;
			}
		}
		System.out.println((s > 0)? "Sunny number" : "Not Sunny number");
	}
}