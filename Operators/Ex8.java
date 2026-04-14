/*Write a program to check a number is 3 digited number or not*/
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number : ");
    int num = sc.nextInt();
    int digit = num/100;
    
    if(digit > 0 && digit <10) {
        System.out.println("number is 3 digited");
    }else{
        System.out.println("number is not 3 digited");
    }
}