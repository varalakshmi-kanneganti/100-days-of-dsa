package Bit_Manipulation;

public class BinaryAND {
    public static void main(String[] args) {
        int a = 12;
        int b = 10;
        // Binary AND
        System.out.println(a & b);

        // AND with zero
        System.out.println(a & 0);

        // AND with itself
        System.out.println(a & a);

        // Check odd or even
        int n = 15;

        if ((n & 1) == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}

