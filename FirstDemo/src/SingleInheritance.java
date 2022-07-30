class Bike1{
	int speed=120;
}
class r15 extends Bike1{
	void speed()
	{
		System.out.println(speed+100);
	}
}
public class SingleInheritance
{
	public static void main(String[] args)
	{
		r15 r=new r15();
		r.speed();
	}
}