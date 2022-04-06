package threadpratice;

class ThreadTest extends Thread {
	
	public void run(){
		
		for(int i = 0; i <= 20; i++){
			System.out.println(i);
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		
		ThreadTest t1 = new ThreadTest();
		t1.start();
		
		/*thread t2 = new thread();
		t2.start();*/

	}
}