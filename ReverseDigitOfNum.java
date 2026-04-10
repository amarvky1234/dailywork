/*Reverse digits of a number */
void main(){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number : ");
    int num = sc.nextInt();
    
    int rev = 0;

    while(num != 0){
        int digit = num % 10;
        rev = rev*10 + digit;
        num = num/10;
    }
    System.out.println("Reverse digit of a number : "+rev);
}