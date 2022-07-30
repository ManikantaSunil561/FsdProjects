
class Bike{
	final int speed=200;
	Bike() {
		speed=speed+200;
		System.out.println("super class :this is a bike"+speed);
	}
}
class R15 extends Bike{
	int speed=300;
	void speedOfR15() {
		speed=super.speed+120;
		System.out.println(speed);
	}
	R15() {
		super();
		System.out.println("speed of r15 is "+speed);
	}
	
}

public class FinalKeyword {
public static void main(String[] args) {
	R15 r15=new R15();
}
}
