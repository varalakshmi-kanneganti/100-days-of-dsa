package Bit_Manipulation;

public class DecimalToBinary2 {
    public static void main(String[] args) {
        int n = 13;
        StringBuilder binary = new StringBuilder();
        if (n == 0) {
            binary.append("0");
        }
        while (n > 0) {
            int remainder = n % 2;
            binary.append(remainder);
            n = n / 2;
        }
        binary.reverse();
        System.out.println(binary);
    }
}

