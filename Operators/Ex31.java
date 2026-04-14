/**Write a program to print even or odd for a given number */
void main(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number : ");
    int num  = sc.nextInt();
    if (num%2 == 0){
        System.out.println("even");
    }else{
        System.out.println("odd");
    }
}