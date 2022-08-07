class iteration1 implements Runnable{
	public void run() {
		num();
	}
	void num() {
		for(int i=0;i<9;i++) {
			System.out.println(i);
		}
	}
	
}

public class Thread3{
	public static void main(String[] args) {
					//normal object
		iteration1 numi=new iteration1();
		//thread obj must be made
		Thread t=new Thread(numi);
		t.start();
	
	}
}
