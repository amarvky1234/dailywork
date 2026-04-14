/* Write a program to check a number is divisible by 7 or not*/
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number : ");
    int num = sc.nextInt();
    if(num%7 == 0){
        System.out.println(num+" divisible by 7");
    }else{
        System.out.println(num+" not divisible by 7");
    }
}