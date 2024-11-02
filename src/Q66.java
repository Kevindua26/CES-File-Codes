class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class Q66 {
    //Write a java program to demonstrate exception handling (user defined exception).
    public static void main(String[] args) {
        try {
            throw new MyException("This is a user-defined exception");
        } catch (MyException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
