/*Print three given numbers in ascending order.*/
import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three numbers:");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    
    if (num1 <= num2 && num1 <= num3) {
        System.out.print(num1 + " ");
        if (num2 <= num3) {
            System.out.print(num2 + " " + num3);
        } else {
            System.out.print(num3 + " " + num2);
        }
    } else if (num2 <= num1 && num2 <= num3) {
        System.out.print(num2 + " ");
        if (num1 <= num3) {
            System.out.print(num1 + " " + num3);
        } else {
            System.out.print(num3 + " " + num1);
        }
    } else {
        System.out.print(num3 + " ");
        if (num1 <= num2) {
            System.out.print(num1 + " " + num2);
        } else {
            System.out.print(num2 + " " + num1);
        }
    }
}