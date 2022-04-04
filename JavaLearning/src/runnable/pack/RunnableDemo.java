package runnable.pack;


class Test implements Runnable{

	
	public void run() {
		for(int i=0;i<5;i++)
		{
			try{
			Thread.sleep(5000);
			}catch(Exception e)
			{
				
			}
		System.out.println("Hi");
		}
		
	}
	
}

public class RunnableDemo {

	public static void main(String[] args) {
		
		Test obj= new Test();
		
		Thread t1=new Thread(obj);//we passing the class onject to thread
		
		t1.start();
		

	}

}
