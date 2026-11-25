package Bit_Manipulation;

public class MissingNumber {
    public static int missingNum(int arr[]){
        int xor = 0;
        for(int i=0; i<arr.length;i++){
        xor = xor^arr[i];
        }
            for(int i=0; i<=arr.length;i++){
            xor = xor^i;
        }
        return xor;
    }
    public static void main (String args[]){
        int arr[] = {3,1,0};
        System.out.println(missingNum(arr));
    }
}
