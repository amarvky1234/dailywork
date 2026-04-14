/*Check if a number is positive or negative.*/
import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    String res = (num > 0) ? "Number is positive" : (num < 0) ? "Number is negative" : "Number is Zero";
    System.out.println(res);
}