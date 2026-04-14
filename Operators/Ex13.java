/*. Write a program to print the given two numbers in descending order*/
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter 1st num : ");
    int num1 = sc.nextInt();
    System.out.print("enter 2nd num : ");
    int num2 = sc.nextInt();

    if(num1 > num2){
        System.out.println("Descending Order : "+num1+","+num2);
    }else{
        System.out.println("Descending Order : "+num2+","+num1);
    }
}