package Bit_Manipulation;
public class OddEven{
    public static void main(String args[]){
        int n = 15;
        if((n&1) == 1){
            System.out.println("Number is Odd");
        }else{
            System.out.println("Number is Even");
        }
    }
}