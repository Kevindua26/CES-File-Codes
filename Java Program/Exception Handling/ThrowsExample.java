public class ThrowsExample {
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
