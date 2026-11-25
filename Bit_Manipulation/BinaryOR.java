package Bit_Manipulation;

public class BinaryOR {
    public static void main(String[] args) {
        int a = 12;
        int b = 10;
        // Binary OR
        System.out.println(a | b);
        // OR with zero
        System.out.println(a | 0);
        // OR with itself
        System.out.println(a | a);
        // Set bit at position 2
        int n = 8;
        int i = 2;
        int result = n | (1 << i);
        System.out.println(result);
    }
}
