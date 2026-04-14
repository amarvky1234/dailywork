/*Write a program to check a number is multiple of 3 or not*/
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number : ");
    int num = sc.nextInt();

    if(num%3 == 0){
        System.out.println(num+" is divisible by 3");
    }else{
        System.out.println(num+" is not divisible by 3");
    }
}