public class Employee {
	int empid;
	String ename;
	String email;
	int phone_no;
	double salary;
	Employee(int empid,String ename,String email,int phone_no,double salary)
	{
		this.empid=empid;
		this.ename=ename;
		this.email=email;
		this.phone_no=phone_no;
		this.salary=salary;
	}
	void display()
	{
		System.out.println(this.empid+","+this.ename+","+this.email+","+this.phone_no+","+this.salary);
	}
}
