/*Check whether a number is divisible by 5 and 11.*/
import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    if (num%5 == 0 && num%11 == 0){
        System.out.println(num + " is divisible by 5 and 11");
    } else {
        System.out.println(num + " is not divisble by 5 and 11");
    }
}