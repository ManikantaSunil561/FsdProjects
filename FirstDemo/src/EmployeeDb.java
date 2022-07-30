public class EmployeeDb {
	private int id;
	private String name;
	private double salary;
	private int bonus;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public void setBonus(int bonus)
	{
		this.bonus=bonus;
	}
	public int getBonus() {
		return (int) (salary+bonus);
	}
	@Override
	public String toString() {
		return "EmployeeDb [id=" + id + ", name=" + name + ", salary=" + salary + ",incremented salary="+getBonus()+"]";
	}
}
