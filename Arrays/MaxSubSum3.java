//more Optimized solution -->Kadane's Algorithm --> Time Complexity -->O(n)
public class MaxSubSum3 {
    public static void MaxSum(int arr[]){
        int currSum = arr[0];
        int maxSum = arr[0];
        for(int i = 1; i<arr.length; i++){
            currSum = Math.max(arr[i],currSum + arr[i]);
            maxSum = Math.max(currSum,maxSum);
        }
        System.out.print("MAX SUBARRAY SUM IS : "+ maxSum);
    }
    public static void main (String args[]){
        int arr[]={1,-2,6,-1,3};
        MaxSum(arr);
    }
}
