/**Add Two Matrix */
class AddTwoMatrix{
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3}, {4,5,6}};
        int[][] matrix2 = {{11,12,13}, {14,15,16}};

        int rows = matrix1.length;
        int cols = matrix1[0].length;

        int[][] addMatrix = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                addMatrix[i][j]= matrix1[i][j]+matrix2[i][j];
                System.out.print(addMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}