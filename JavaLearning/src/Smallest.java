public class Smallest {
	public static void main(String[] args) {
		int[] a = new int[] {5, 3, 7, 2, 8};
		int t = 0;
		System.out.println("Oringinal array is:");
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		for(int i = 0; i < a.length; i++){
			for(int j = i + 1; j < a.length; j++){
				if(a[i] > a[j]){
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		System.out.println("\nsmallest element in the array is: " + a[0]);
	}
}