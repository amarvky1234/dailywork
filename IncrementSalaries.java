/**29. Increment salaries by 5% in a given array. */
void main(){
    double[] sal = {125, 128.5, 120, 85, 112};

    for(int i=0; i<=sal.length-1; i++){
        System.out.print("$");
        System.out.println(sal[i]+(sal[i]*0.05));
    }
}