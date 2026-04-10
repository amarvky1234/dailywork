/**Read 5 numbers and print the average */
void main(){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number : ");
    int[] num = new int[5];
    
    double sum = 0;

    for(int i=0; i<5; i++){
        num[i] = sc.nextInt();
        sum = sum + num[i];
    }
    System.out.println("sum : "+sum);
    double avg = sum/5;
    System.out.println("Average : "+avg);
}