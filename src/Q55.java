class Circle {
    double radius;
    double area;
    double circumference;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        this.area = Math.PI * this.radius * this.radius;
    }

    public void calculateCircumference() {
        this.circumference = 2 * Math.PI * this.radius;
    }

    public void display() {
        System.out.println("Area: " + this.area);
        System.out.println("Circumference: " + this.circumference);
    }
}

public class Q55 {
    //Write a java program to create a class named as circle, create its two objects C1 and C2 and display the area and circumference using methods.
    public static void main(String[] args) {
        Circle C1 = new Circle(5);
        Circle C2 = new Circle(10);

        C1.calculateArea();
        C1.calculateCircumference();
        C1.display();

        C2.calculateArea();
        C2.calculateCircumference();
        C2.display();
    }
}
