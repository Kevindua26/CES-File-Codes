class Student
{
    //Properties of a class
    String name = "Navin";
    //Method of a class
    void speak() {
        System.out.println("Hello everybody i am "+name);
    }
}

public class Q54 {
    //Write a java program to demonstrate the concept of class and object student.
    public static void main(String[] args)
    {
        Student stud1= new Student();
        stud1.name=args[0];
        stud1.speak();
    }
}
