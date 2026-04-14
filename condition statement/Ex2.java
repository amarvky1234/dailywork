/*check if a number is a factor of 84 */
import java.util.Scanner;
void main() {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scn.nextInt();
    String res = (84%num == 0) ? num + " is a factor of 84" : num + " is not a factor of 84";
    System.out.println(res);
}