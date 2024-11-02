public class Q59 {
    //Write a java program to add two integer data and string data by using method overloading.
    //         Example ("Delhi","Wala")
    //         Output :- DelhiWala
    public int add(int a, int b) {
        return a + b;
    }

    // Method to concatenate two strings
    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Q59 q = new Q59();

        // Adding two integers
        int intResult = q.add(5, 10);
        System.out.println("Sum of integers: " + intResult);

        // Concatenating two strings
        String strResult = q.add("Delhi", "Wala");
        System.out.println("Concatenated strings: " + strResult);
    }

}
