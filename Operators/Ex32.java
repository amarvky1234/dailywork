/**Write a program to print the greatest number in given two numbers */
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter first number : ");
    int num1 = sc.nextInt();
    System.out.print("enter second number : ");
    int num2 = sc.nextInt();

    if(num1> num2){
        System.out.println(num1+" is greater");
    }else{
        System.out.println(num2+" is greater");
    }
}