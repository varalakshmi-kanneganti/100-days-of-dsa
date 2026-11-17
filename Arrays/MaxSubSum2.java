//Optimized solution -->prefixsum-->Time Complexity -->O(n^2)
public class MaxSubSum2 {
    public static void MaxSum(int arr[]){
        int n =  arr.length;
        int prefix[] = new int [n];
        prefix[0] = arr[0];
        //Build Prefix
        for(int i = 1; i<n; i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        int maxSum= Integer.MIN_VALUE;
        //Generate SubArray
        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                int currSum;
                if(i == 0){
                currSum = prefix[j];
                }else{
                    currSum = prefix[j]-prefix[i-1];
                }
                maxSum = Math.max(currSum,maxSum);
            }
        }
        System.out.print("MAX SUBARRAY SUM IS : " + maxSum);
    }
    public static void main(String args[]){
        int arr[]= {6,-3,-1,4,2,-1};
        MaxSum(arr);
    }
}
