/**31. Increment all salaries in an array by 5%.*/
void main(){
    double[] sal = {125, 128.5, 120, 85, 112};

    double inSal = 0;

    for(int i=0; i<=sal.length-1; i++){
        inSal = inSal + sal[i];
    }
    System.out.println("All salaries : "+ inSal);
    System.out.print("All salaries increment by 5% : ");
    System.out.print(inSal+(inSal*0.05));
}