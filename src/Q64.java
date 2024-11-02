public class Q64 {
    //Write a java program to demonstrate exception handling using try, cath and finally block.
    public static void main(String args[]) {
        try {
            int data = 50 / 0;
            System.out.println("The value is "+data);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e);
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
