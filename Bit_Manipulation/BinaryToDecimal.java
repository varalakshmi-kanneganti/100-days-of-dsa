package Bit_Manipulation;

public class BinaryToDecimal {
    public static void main(String args[]){
        String binary = "110";
        int decimal = 0;
        for(int i=0;i<binary.length(); i++){
            int bit = binary.charAt(i)-'0';
            decimal = decimal * 2 + bit;
        }
        System.out.println(decimal);
    }
}
