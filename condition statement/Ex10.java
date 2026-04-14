/*Find the least number among two numbers.  */
import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int num1 = sc.nextInt();
    System.out.println("Enter the second number: ");
    int num2 = sc.nextInt();

    String result = (num1 < num2) ? "The least number is: " + num1 : (num2 < num1) ? "The least number is: " + num2 : "Both numbers are equal.";
    System.out.println(result);
}