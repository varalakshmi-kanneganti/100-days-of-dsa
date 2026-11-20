package Arrays2D;

public class CreateArray {
    public static void main(String args[]){
        int arr[][] = new int [2][3];
        int count = 1;
        for (int i=0; i<2;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=count;
                count++;
            }
        }
        for(int i=0; i<2;i++){
            for(int j = 0; j<3;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
