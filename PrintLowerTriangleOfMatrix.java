/**print the lower triangle of the matrix */
class PrintLowerTriangleOfMatrix{
    public static void main(String[] args) {
        int[][] matrix = {{11, 22, 33}, {12, 24, 36}, {13, 26, 39}};

        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(i>=j){
                    System.out.print(matrix[i][j]+" ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}