import java.util.Scanner;
void main(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = sc.nextInt();
    for (int i=10; i>=1; i--){
        int mul = num*i;
        System.out.print(mul+",");
    }
}