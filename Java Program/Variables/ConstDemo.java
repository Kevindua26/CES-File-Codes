public class ConstDemo 
{
    // Constant variable
    public static final int MAX_VALUE = 100;

    public static void main(String[] args) {
        // Trying to change the value of a constant will result in a compilation error
        MAX_VALUE = MAX_VALUE+1; // This will produce a compilation error
        System.out.println("The maximum value is: " + MAX_VALUE);
    }
}
