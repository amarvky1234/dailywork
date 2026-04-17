class MatrixAssignment{
    public static void main(String[] args) {
        higestMarks();
        System.out.println();
        passedStudent();
        System.out.println();
        percentageOfStudent();
        System.out.println();
        //studentFailedInEachSubject();
        System.out.println();
        classAvg();

    }

    public static void higestMarks(){
        int[][] marks = {{51,54,56}, {67,57,71}, {56,71,45}, {75,86,82}, {66,61,57}};

        int rows = marks.length;
        int cols = marks[0].length;

        int max = 0;
        int count = 0;
        for(int i=0; i<rows; i++){
            int sum =0;
            for(int j=0; j<cols; j++){
                sum += marks[i][j];
            }
            //System.out.println(sum);
            if(sum>max){
                max=sum;
                count = i+1;
            }
        }
        System.out.println(count+" Student get more marks " + max);
    }

    public static void passedStudent(){
        int[][] marks = {{34,23,42}, {67,57,71}, {56,71,45}, {40,41,34}, {66,61,57}};

        int rows = marks.length;
        int cols = marks[0].length;

        int count = 0;
        for(int i=0; i<rows; i++){
            int sum =0;
            for(int j=0; j<cols; j++){
                sum += marks[i][j];
            }
            //System.out.println(sum);
            if(sum>=120){
                count++;
            }
        }
        System.out.println("Total no of student passed : "+count);
    }

    public static void percentageOfStudent(){
        int[][] marks = {{34,23,42}, {67,57,71}, {56,71,45}, {40,41,34}, {66,61,57}};

        int rows = marks.length;
        int cols = marks[0].length;

        System.out.println("Percentage of each student are : ");
        for(int i=0; i<rows; i++){
            double sum =0;
            for(int j=0; j<cols; j++){
                sum += marks[i][j];
            }
            //System.out.println(sum);
            if(sum>0){
                double per = sum/cols;
                System.out.println(per+" is percentage of "+(i+1)+" student");
            }
        }
    }

    public static void studentFailedInEachSubject(){
        int[][] marks = {{34,56,42}, {67,57,71}, {56,71,45}, {40,31,34}, {36,61,57}};

        int rows = marks.length;
        int cols = marks[0].length;
        
        int count = 0;
        for(int j=0; j<cols; j++){
            for(int i=0; i<rows; i++){
                if(marks[i][j]<40){ 
                    System.out.println((j+1)+ " subject failed student = "+count);
                    count++;
                }
            }
            System.out.println();
            count=0;
        }
        //System.out.println("No of student are failed in each subject: "+count);
    }

    public static void classAvg(){
        int[][] marks = {{34,63,42}, {67,57,71}, {56,71,45}, {40,41,64}, {66,61,57}};

        int rows = marks.length;
        int cols = marks[0].length;
        
        double toatalAvg = 0;

        for(int i=0; i<rows; i++){
            double sum =0;
            for(int j=0; j<cols; j++){
                sum += marks[i][j];
            }
            
            if(sum>0){
                double per = sum/cols;
                toatalAvg += per;
            }
        }
        System.out.println("class avg : "+toatalAvg/rows);
    }
}