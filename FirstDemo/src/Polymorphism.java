class Demo{
	void args() {
		System.out.println("no args");
	}
	void args(int a,int b) {
		System.out.println("2  args of int");
	}
	void args(double a , double b) {
		System.out.println("2 args of double");
	}

}


public class Polymorphism{
public static void main(String[] args) {
	Demo demo=new Demo();
	demo.args(3,4);
}
}
