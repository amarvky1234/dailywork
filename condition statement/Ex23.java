/*Check whether a number is negative, positive, or zero.*/
import java.util.Scanner;

void main() {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = scn.nextInt();

    String res = (num > 0) ? "number is positive" : (num < 0) ? "number is negative" : "number is zero";
    System.out.println(res);
}