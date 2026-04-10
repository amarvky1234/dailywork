/**Print all the digit less than 5*/
void main(){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number : ");
    int num = sc.nextInt();

    while(num > 0){
        int digit = num % 10;
        if(digit < 5){
            System.out.println(digit);
        }
        num = num/10;
    }
}