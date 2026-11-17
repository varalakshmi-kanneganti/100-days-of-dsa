//Brute force --> Time complexity-->O(n^3)
public class MaxSubSum1 {
    public static void MaxSum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            for(int j = i ; j< arr.length;j++){
                int currSum = 0;
                for(int k = i;k<=j;k++){
                    currSum += arr[k];

                }
                maxSum = Math.max(currSum,maxSum); 
            }
        }
        System.out.print("MAXIMUM SUBARRAY SUM IS : "+ maxSum);
    }
    public static void main(String args[]){
        int arr[]= { 6,-3,-1,4,2,-1};
        MaxSum(arr);
    }
}
