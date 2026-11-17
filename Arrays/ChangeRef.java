public class ChangeRef {
    public static void ChangeArray(int arr[]){
        arr = new int[]{10,20,30};
    }
    public static void main (String args[]){
        int numbers[] = {2,3,4};
        ChangeArray(numbers);
        System.out.println(numbers[0]);
    }
}
