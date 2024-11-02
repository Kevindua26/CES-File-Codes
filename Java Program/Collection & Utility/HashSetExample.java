import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("One"); // Duplicate element

        for (String value : set) {
            System.out.println(value);
        }
    }
}
