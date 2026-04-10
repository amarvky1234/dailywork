/**Read 5 numbers and print the sum */
void main(){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number : ");
    int[] num = new int[5];
    
    int sum = 0;

    for(int i=0; i<5; i++){
        num[i] = sc.nextInt();
        sum = sum + num[i];
    }
    System.out.println("sum of all the digit of a number : "+sum);
}