
public class LargestNum {

    public static int largest(int arr[]) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String args[]) {
        int arr[] = {20, 40, 80, 60, 10};

        int result = largest(arr);

        System.out.println("Largest element is: " + result);
    }
}
