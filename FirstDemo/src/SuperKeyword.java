class car
{
	int speed=200;
}
class vehicle extends car
{
	int speed=100;
	void display() {
		System.out.println("Speed is:"+super.speed);
	}
}
public class SuperKeyword {
	public static void main(String[] args) {
	vehicle v=new vehicle();
	v.display();
	}
}
