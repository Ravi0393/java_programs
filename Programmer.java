class Employee
{
	int id;
	String name;
	Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
}

class Programmer extends Employee
{
	int salary;
	Programmer(int id, String name, int salary)
	{
		super(id, name);
		this.salary = salary;
	}

	public static void main(String[] args) {
		Programmer p = new Programmer(2,"Ajay", 100000);
		System.out.println(p.id+" "+p.name+" "+p.salary);
	}
}



