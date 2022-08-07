package Ap1;
class EmpInfo{
	int id;
	String name;

void display() {
	name="Sunil";
	id=100;
	System.out.println(id+" "+name);
	}
}

public class DefaultConstructor{

public static void main(String[] args) {

	EmpInfo emp1=new EmpInfo();
	EmpInfo emp2=new EmpInfo();

	emp1.display();
	emp2.display();
	}
}