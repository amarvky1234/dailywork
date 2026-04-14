/*Check if a number is a three-digit number.*/
import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    String rs = (num >= 100 && num <= 999) ? "Number is a three-digit number." : "Number is not a three-digit number.";
    System.out.println(rs);
}