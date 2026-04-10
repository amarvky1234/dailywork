/**Count the number of 1's in a given number*/
void main(){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number : ");
    int num = sc.nextInt();

    int count = 0;

    while(num > 0){
        int digit = num % 10;
        System.out.println("d : "+digit);
        if(digit == 1){
            count++;
        }
        num = num/10;
        System.out.println("num : "+num);
    }
    System.out.println("Number of 1's in a given number is "+count);
}