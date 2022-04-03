package thread.pack;

class ThreadDemo extends Thread
{
	
	//t1 --wait //allow //wait-release
	//--t --wait
	public void run()
	{
	
	for(int i=0;i<15;i++)
	{
		System.out.println(i);
	}
	}
	
	
}

public class Mutli {

	public static void main(String[] args) {
		
		ThreadDemo  t= new ThreadDemo();
            t.start();
            
           ThreadDemo  t1= new ThreadDemo();
            t1.start();

	}

}
