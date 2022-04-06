package threadpratice;

class RunnableTest implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 10; i ++){
			try {
				
				Thread.sleep(1000);
				
			} catch(Exception e){
				
			}
			System.out.println("Shanthosh" + i);
		}
	}
}

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableTest r = new RunnableTest();
		Thread t = new Thread(r);
		t.start();
	}
}
