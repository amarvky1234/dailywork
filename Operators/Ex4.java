/*Write a program to check a number is factor of 84 or not*/
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number : ");
    int num = sc.nextInt();

    if(84%num == 0){
        System.out.println(num+" is a factor of 84");
    }else{
        System.out.println(num+" is not a factor of 84");
    }
}