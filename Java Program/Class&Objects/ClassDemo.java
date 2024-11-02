class Student
{
	
	//Properties of a class
	String name = "Navin";
	//Method of a class
	void speak()
	{
		System.out.println("Hello everybody i am "+name);
	}
}

class ClassDemo
{
	public static void main(String args[])
	{
		//Creating Object of Student Class using Default Constructor
		Student stud1= new Student();
		stud1.name=args[0];
		stud1.speak();




	}
}
	