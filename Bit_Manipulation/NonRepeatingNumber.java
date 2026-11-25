package Bit_Manipulation;

public class NonRepeatingNumber {
    public static int SingleNumber(int arr[]){
        int xor = 0;
        for(int i=0; i<arr.length;i++){
            xor= xor^ arr[i];
        }
        return xor;
    }
    public static void main(String args[]){
        int arr[]= {2,3,5,3,2};
        System.out.println(SingleNumber(arr));
    }
}
