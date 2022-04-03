package files;

import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{    
            FileOutputStream fout=new FileOutputStream("D:\\Shanthosh.txt");    
          //  fout.write(65);   // 65 A //66 B //67 C //Z//97 a 
            
            
            String s="Welcome to javaTpoint. Learning java";   
            
            byte b[]=s.getBytes();//converting string into byte array 
            
            fout.write(b);   
            
            fout.close();    
            System.out.println("success...");    
           }catch(Exception e){System.out.println(e);}    
     }  

	

}
