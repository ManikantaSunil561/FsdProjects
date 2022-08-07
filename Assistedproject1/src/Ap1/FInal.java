package Ap1;
public class FInal{
	public static void main(String[] args) {
		System.out.println("hi users");
		try {
			try {
				int a=50/2;//exception obj is invoked
			}
			catch(Exception e) {
				System.out.println(e);	
			}
			int b[]= {2,3,4,5,6};
			b[3]=24;
		}
		finally {
			System.out.println("end of execution");
		}
		System.out.println("welcome to phase 1");
	
	}
	

}
