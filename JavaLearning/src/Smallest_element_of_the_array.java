public class Smallest_element_of_the_array {
	public static void main(String[] args) {
		int a[] = {38, 29, 75, 16, 52, 40, 92, 14, 55, 70}, s = a[0];
		for(int i = 0; i < a.length; i++){
			if(a[i] < s)
				s = a[i];
		}
		System.out.println("Smallest element of the array is: " + s);
	}
}