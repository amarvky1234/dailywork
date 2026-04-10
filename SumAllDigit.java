/**Sum of all the digit of a number */
void main(){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number : ");
    int num = sc.nextInt();
    
    int sum = 0;

    while(num > 0){
        int digit = num % 10;
        sum += digit;
        num = num/10;
    }
    System.out.println("sum of all the digit of a number : "+sum);
}