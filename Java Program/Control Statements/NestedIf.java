class NestedIf{
public static void main(String args[]){ 
int x = -2;
int y = 1;

if (x >= 0) {
    if (y >= 0) {
        System.out.println("Both x and y are positive");
    } else {
        System.out.println("x is positive but y is not positive");
    }
} else {
    System.out.println("both the no are negative");
}}}
