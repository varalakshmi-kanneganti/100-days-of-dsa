package Arrays2D;

public class SearchInMatrix {
    public static void main(String args[]){
        int[][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        int target = 29;
        int i = 0;
        int j = matrix[0].length-1;
         while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target) {
                System.out.println("Found at: " + i + ", " + j);
                return;
            }
            else if (matrix[i][j] > target) {
                j--;
            }
            else {
                i++;
            }
        }
        System.out.println("Element not found");
    }
}
