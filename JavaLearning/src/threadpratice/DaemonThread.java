package threadpratice;

class Test extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon()){//checking for daemon thread  
			   System.out.println("daemon thread work"+Thread.currentThread().getName());  
			  }  
			  else{  
			  System.out.println("user thread work"+Thread.currentThread().getName());  
			 }  
	}
}

public class DaemonThread {
	

	public static void main(String args[])
	{
		Test t1=new Test();
		  Test t2=new Test();
		  System.out.println("Name of t1:"+t1.getName());  
		  System.out.println("Name of t2:"+t2.getName());  
		
		  t1.setDaemon(true);//now t1 is daemon thread
		  t1.start();
		  t1.setName("Santhosh");
		  
		  
		  
		
			t2.start();
			t2.setName("Sam");
	}
}
