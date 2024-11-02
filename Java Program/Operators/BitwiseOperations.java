public class BitwiseOperations {
    public static void main(String[] args) {
        int a = 10; // 101
        int b = 11; // 011
        
        // Bitwise AND
        int bitwiseAnd = a & b; //1010
        System.out.println("Bitwise AND: " + bitwiseAnd);
        
        // Bitwise OR
        int bitwiseOr = a | b; // 1011
        System.out.println("Bitwise OR: " + bitwiseOr);
        
        // Bitwise XOR
        int bitwiseXor = a ^ b; // 110
        System.out.println("Bitwise XOR: " + bitwiseXor);
        
        // Bitwise NOT
        int bitwiseNotA = ~a; //
        System.out.println("Bitwise NOT of a: " + bitwiseNotA);
        
        // Left shift
        int leftShift = a << 1; // 10100
        System.out.println("Left shift of a: " + leftShift);
        
        // Right shift
        int rightShift = a >> 1; // 
        System.out.println("Right shift of a: " + rightShift);
    }
}
