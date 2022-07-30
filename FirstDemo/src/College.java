
public class College {
	int id;
	String name;
	static String college="iit";
	public College(int id, String name) {
		this.id = id;
		this.name = name;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+college);
	}
	void change(String newcollege)
	{
		college=newcollege;
	}
}
