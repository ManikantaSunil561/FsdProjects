package Ap1;
class NumberIteration implements Runnable
{
	public void run() 
	{
		for(int i=0;i<9;i++) 
		{
			System.out.println(i);
		}
	}	
}
public class Threads{
	public static void main(String[] args) {
		NumberIteration numi=new NumberIteration();
		Thread t=new Thread(numi);
		t.start();
	}
}