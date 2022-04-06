package threadpratice;

class TestCallRun1 extends Thread{  
	 public void run(){  
	   System.out.println("running...");  
	 }
}

public class RunCallingDemo {

	public static void main(String[] args) {
		
		TestCallRun1 t1= new TestCallRun1();
		t1.run();//should not do like this
		

	}

}
