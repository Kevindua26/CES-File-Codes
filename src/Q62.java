class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class Q62 {
    //Write a java program to demonstrate hierarchical inheritance.
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited method
        dog.bark(); // Method in Dog

        Cat cat = new Cat();
        cat.eat(); // Inherited method
        cat.meow(); // Method in Cat
    }
}
