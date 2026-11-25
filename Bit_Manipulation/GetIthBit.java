package Bit_Manipulation;

public class GetIthBit {
    public static  void main(String args[]){
        int n = 3;
        int i = 1;
        if((n & (1 << i)) != 0){
            System.out.println("Bit is 1");
        }else{
            System.out.println("Bit is 0");
        }
    }
}
