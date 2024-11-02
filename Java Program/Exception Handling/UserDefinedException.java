class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
public class UserDefinedException {
    public static void main(String[] args) {
        try {
            throw new MyException("This is a user-defined exception");
        } catch (MyException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}