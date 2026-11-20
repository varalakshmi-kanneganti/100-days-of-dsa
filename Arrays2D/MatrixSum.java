package Arrays2D;

public class MatrixSum {
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},{5,3,2,1},{8,3,5,2},{6,3,2,1}};
        int sum = 0;
        int n = matrix.length;
        for(int i = 0; i<n;i++){
            for(int j=0; j<n;j++){
                if(i == j || i+j == n-1){
                    sum += matrix[i][j];
                }
            }
        }
        System.out.print("Matrix Sum is : "+ sum);
    }
}
