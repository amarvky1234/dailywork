void main() {
    int sum = 0;
    int count = 0;
    for(int i=1; i<=10; i++){
        sum += i;
        System.out.println(i);
        count++;
    }
    double avg = (double)sum/count;
    System.out.println("Average of 1 to 10 : "+avg);
}