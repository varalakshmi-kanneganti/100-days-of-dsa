package Bit_Manipulation;

public class UpdateBit {
    public static int update(int n , int i ,int v){
         n = n & ~(1<<i);
         return n | (v <<i);

    }
   public static void main (String args[]){
    System.out.println(update(10,2,1));
     System.out.println(update(10, 1, 0));
   } 
}
