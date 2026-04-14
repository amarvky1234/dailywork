/*Write a program to check a number is having 4 at units place (984)*/
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number : ");
    int num = sc.nextInt();
    int unit = num%10;
    if(unit == 4){
        System.out.println("number is having 4 at units place");
    }else{
        System.out.println("number is not having 4 at units place");
    }
}