class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
}

public class Q57 {
    //Write a java program to demonstrate method pass by reference.
    static void changeName(Person person) {
        person.name = "John";
    }
    public static void main(String[] args) {
        Person p = new Person("Alice");
        changeName(p);
        System.out.println(p.name); // Output: John
    }
}
