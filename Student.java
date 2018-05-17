class Student
{  
	int id;
 	String name;
 	static String college = "MNIT"; 
 	Student(int id, String name)
 	{
 		this.id = id;
 		this.name = name;
 	} 
 	Student()
 	{
 		id = 0;
 		name = "default";
 	}
  	public static void main(String args[])
  	{  
  		Student s1 = new Student(3,"Avinash"); 
		Student s2 = new Student();
		System.out.println(s1.id+" "+s1.name+" "+Student.college);
		System.out.println(s2.id+" "+s2.name+" "+Student.college);
 	}  
}  