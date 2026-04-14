/*Check if a number is a multiple of 3.*/
import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    String res = (num%3 == 0) ? num + " is a multiple of 3." : num + " is not a multiple of 3.";
    System.out.println(res);
}