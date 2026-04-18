/**print the transpose of  matrix */
class PrintTransposeOfMatrix{
    public static void main(String[] args) {
        int[][] arr = {{2,3,5}, {4,7,9}};
        
        int rows = arr.length;
        int cols = arr[0].length;

        for(int i=0; i<cols; i++){
            for(int j=0; j<rows; j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
     }
}

