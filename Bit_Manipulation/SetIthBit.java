package Bit_Manipulation;

public class SetIthBit {
    public static void main(String args[]){
        int n = 2; 
        int i = 2;
        int result = n|(1<<i);
        System.out.println(result);
    }
}
