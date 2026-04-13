/*Write a program to print the number at 10's place */
void main(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = sc.nextInt();

    int res = (num/10) % 10;
    System.out.println("Number at 10's place : "+res);
}