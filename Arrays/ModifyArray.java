public class ModifyArray {
    public static void UpdateArray(int arr[]){
        arr[0] = 10;
    }
    public static void main(String args[]){
        int numbers[] = { 2,3,4};
        UpdateArray(numbers);
        System.out.println(numbers[0]);
    }
}
