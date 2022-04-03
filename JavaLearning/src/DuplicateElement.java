public class DuplicateElement {  
public static void main(String[] args) {  
        int [] a = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3}; 
        int[] b = new int [a.length];
        int c = -793216549;
        System.out.println("Duplicate elements in given array: ");  
        for(int i = 0; i < a.length; i++) {  
            for(int j = i + 1; j < a.length; j++) {  
                if(a[i] == a[j]){ 
                    System.out.println(a[j]);
                    a[i] = c;
                    c--;
                }
            }  
        }  
    }  
}  