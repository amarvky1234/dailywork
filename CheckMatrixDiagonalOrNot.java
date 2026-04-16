class CheckMatrixDiagonalOrNot{
    public static void main(String[] args) {
        int[][] matrix = {{1,0,0}, {0,2,0}, {0,0,3}};

        boolean isDiagonal = true;

        int rows= matrix.length;
        int cols= matrix[0].length;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(j != i && matrix[i][j] != 0){
                    isDiagonal=false;
                }
            }
        }
        if(isDiagonal){
            System.out.println("Given matrix is diagonal");
        }else{
            System.out.println("Given matrix not diagonal");
        }
    }
}