/*Write a program to check a number is positive or not.*/
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number : ");
    int num = sc.nextInt();

    if(num > 0){
        System.out.println(num+" is positive number.");
    }else{
        System.out.println(num+" is not positive number.");
    }
}