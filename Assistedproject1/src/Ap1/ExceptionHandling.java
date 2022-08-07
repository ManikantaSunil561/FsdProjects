package Ap1;
public class ExceptionHandling{
	public static void main(String[] args) {
		System.out.println("hi users");
		try {
			try {
				int a=50/0;//exception obj is invoked
			}
			catch(Exception e) {
				System.out.println(e);	
			}
			int b[]= {2,3,4,5,6};
			b[8]=24;
		}
		catch(Exception e) {
			System.out.println(e);	
		}
		System.out.println("welcome to phase 1");
	}

}
