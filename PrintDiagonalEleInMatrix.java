/**Print only the diagonal elements in matrix format */
class PrintDiagonalEleInMatrix{
    public static void main(String[] args) {
        int[][] matrix = {{5, 10, 15}, {20, 25, 30}, {35, 40, 45}};

        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(i==j){
                    System.out.print(matrix[i][j]);
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}