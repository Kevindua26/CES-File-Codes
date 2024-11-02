interface Animal {
    void eat();
}

interface Pet {
    void play();
}

class Dog implements Animal, Pet {
    @Override
    public void eat() {
        System.out.println("The dog eats food.");
    }

    @Override
    public void play() {
        System.out.println("The dog plays with a ball.");
    }
}

public class Q63 {
    //Write a java program to demonstrate multiple inheritance with the help of an interface.
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Method from Animal interface
        dog.play(); // Method from Pet interface
    }
}
