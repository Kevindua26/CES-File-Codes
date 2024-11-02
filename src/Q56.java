public class Q56 {
    //Write a java program to demonstrate method pass by value.
    static void increment(int num) {
        num++;  // Changes are local to this method
        System.out.println("After Increment the value is "+num);
    }
    public static void main(String[] args) {
        int x = 5;
        increment(x);
        // x is still 5, as increment operates on a copy
        System.out.println(x); // Output: 5
    }
}
