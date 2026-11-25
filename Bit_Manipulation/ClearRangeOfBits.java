package Bit_Manipulation;

public class ClearRangeOfBits {
    public static int ClearRange(int n , int i,int j){
        int mask = ((1<<(j-i+1))-1)<<i;
        return n & ~mask;
    }
    public static void main(String args[]){
        System.out.println(ClearRange(63,1,3));
    }
}
