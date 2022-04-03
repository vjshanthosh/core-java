import java.io.FileOutputStream;


public class FOUT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileOutputStream fout = new FileOutputStream("D:\\HelloWorld.txt");
			String s = "Hello World";
			fout.write(s.getBytes());
		}catch(Exception e){
			
		}
	}

}
