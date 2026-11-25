package Bit_Manipulation;

public class ClearIthBit {
    public static void main(String args[]){
        int n = 10; 
        int i = 1;
        int result = n & ~(1<<i);
        System.out.println(result);
    }
}
