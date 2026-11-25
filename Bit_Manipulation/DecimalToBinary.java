package Bit_Manipulation;

public class DecimalToBinary {
    public static void main(String args[]){
        int n = 25;
        String binary = "";
        while(n>0){
            int rem = n%2;
            binary = rem+binary;
            n = n/2;
        }
        System.out.println(binary);
    }
}
