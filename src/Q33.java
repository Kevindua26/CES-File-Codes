public class Q33 {
/*
    Write a java program to print the pattern in reverse order using nested for loop.
    12345
    1234
    123
    12
    1
*/
    public static void main(String[] args) {
        int n = 5;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n-row; col++) {
                System.out.print(col+1);
            }
            System.out.println();
        }
    }
}
