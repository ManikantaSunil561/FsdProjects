public class EmployeeDbDetails {
	public static void main(String[] args) {
		EmployeeDb db1=new EmployeeDb();
		EmployeeDb db2=new EmployeeDb();
		EmployeeDb db3=new EmployeeDb();
		db1.setId(100);
		db1.setName("Suresh");
		db1.setSalary(1000);
		db1.setBonus(500);
		db2.setId(200);
		db2.setName("Ramesh");
		db2.setSalary(2000);
		db2.setBonus(500);
		db3.setId(300);
		db3.setName("Naresh");
		db3.setSalary(3000);
		db3.setBonus(500);
		System.out.println(db1);
		System.out.println(db2);
		System.out.println(db3);
		
		
	}
}
