

class Bike{
	int speed=200;
	void display() {
		System.out.println("super class :this is a bike"+speed);
	}
}
class R15 extends Bike{
	int speed=300;
	void speedOfR15() {
		speed=super.speed+120;
		System.out.println(speed);
	}
	void display() {
		super.display();
	}
	
}

public class 	 {
public static void main(String[] args) {
	R15 r15=new R15();
	r15.display();
	r15.speedOfR15();
}
}
