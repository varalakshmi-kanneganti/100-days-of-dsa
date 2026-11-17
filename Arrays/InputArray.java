package Arrays;
import java.util.*;
public class InputArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        for(int i = 0; i<arr.length;i++){
            arr[i]=sc.nextInt();
            
        }
        System.out.print("Print Original Array:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        arr[2]= 50;
        System.out.println();
        System.out.print("Updated Array:");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    
}
