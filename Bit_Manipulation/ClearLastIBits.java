package Bit_Manipulation;

public class ClearLastIBits {
    public static void main(String args[]){
        int n = 13;
        int i = 1;
        int result = n &(-1 << 1);
        System.out.println(result);
    }
}
