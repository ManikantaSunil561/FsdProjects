class iteration implements Runnable{
	public void run() {
		for(int i=0;i<9;i++) {
			System.out.println(i);
		}
	}
	
}

public class Thread2{
	public static void main(String[] args) {
					//normal object
		iteration numi=new iteration();
		//thread obj must be made
		Thread t=new Thread(numi);
		t.start();
	
	}
}
