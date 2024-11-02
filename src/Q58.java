public class Q58 {
    //Write a java program to demonstrate method overloading.
    static void print(int num) {
        System.out.println("Integer"  + num);
    }

    static void print(double num) {
        System.out.println("Double"  + num);
    }

    public static void main(String[] args) {
        print(5);        //Calls print(int)
        print(3.14);     //Calls print(double)
    }
}
