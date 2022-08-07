import java.util.Iterator;
import java.util.LinkedHashSet;
class Emp{
	private int no;
	private String name;
	private double salary;
	public int getEmpno() {
		return no;
	}
	public void setEmpno(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
public class Employee1
{
	public static void main(String[] args) {
		LinkedHashSet<Emp> hs=new LinkedHashSet<>();
		Emp e1=new Emp();
		e1.setEmpno(100);
		e1.setName("ssss");
		e1.setSalary(29000);
		hs.add(e1);
		Emp e2=new Emp();
		e2.setEmpno(200);
		e2.setName("k");
		e2.setSalary(9000);
		hs.add(e2);
		Emp e3=new Emp();
		e3.setEmpno(300);
		e3.setName("b");
		e3.setSalary(2000);
		hs.add(e3);

		
		Iterator i=hs.iterator();

		
		while(i.hasNext()) {
			Emp s=(Emp)i.next();
			System.out.println(s.getEmpno()+"   "+s.getName()+"  "+s.getSalary());
		}

	}
	
}
