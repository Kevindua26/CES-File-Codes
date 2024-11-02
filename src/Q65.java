public class Q65 {
    //Write a java program to demonstrate exception handling using throws keyword.
    public static void main(String[] args) throws ArithmeticException {
        try {
            int data = 50 / 0;
        }
        // no need of catch block
        finally {
            System.out.println("Finally block executed");
        }
    }
}
