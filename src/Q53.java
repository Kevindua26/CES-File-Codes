class Car {
    // Attributes
    String color;
    int year;

    // Constructor
    public Car(String c, int y) {
        color = c;
        year = y;
    }

    // Method
    public void start() {
        System.out.println("The car is starting.");
    }
}

public class Q53 {
    public static void main(String[] args) {
        // Creating objects
        Car car1 = new Car("Red", 2022);
        Car car2 = new Car("Blue", 2023);

        // Accessing object properties
        System.out.println("Car 1 color: " + car1.color);
        System.out.println("Car 1 year: " + car1.year);

        // Calling object methods
        car1.start();

        System.out.println("Car 2 color: " + car2.color);
        System.out.println("Car 2 year: " + car2.year);

        // Calling object methods
        car1.start();

    }
}
