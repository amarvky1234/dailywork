/**Multiply two matrix */
class MultiplyTwoMatrix{
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2}, {4,5}};
        int[][] matrix2 = {{11,12}, {14,15}};

        int rows = matrix1.length;
        int cols = matrix1[0].length;

        int[][] addMatrix = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                addMatrix[i][j] = 0;
                for(int k=0; k<cols; k++){
                    addMatrix[i][j] += matrix1[i][k]*matrix2[k][j];
                }
            }
        }

        for(int i =0; i<addMatrix.length; i++){
            for(int j=0; j<addMatrix.length; j++){
                System.out.print(addMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}