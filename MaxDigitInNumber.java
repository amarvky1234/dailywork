/**Greatest digit of a number*/
void main(){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number : ");
    int num = sc.nextInt();

    int max = 0;

    while(num > 0){
        int digit = num % 10;
        System.out.println("d : "+digit);
        if(digit > max){
            max = digit;
        }
        num = num/10;
        System.out.println("num : "+num);
    }
    System.out.println("Greatest digit of a number is "+max);
}