class numberiteration extends Thread
{
	public void run()
	{
		for(int i=0;i<9;i++)
		{
			System.out.println(i);
		}
	}
}
public class Thread1 {
	public static void main(String[] args) {
		numberiteration n=new numberiteration();
		n.start();
	}
}
