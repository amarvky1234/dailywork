/* Check if a character is uppercase, lowercase, special character, or digit.*/
import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a character: ");
    char ch = sc.next().charAt(0);

    String res = (ch >= 'A' && ch <= 'Z') ? "character is uppercase" :
                (ch >= 'a' && ch <= 'z') ? "character is lowercase" :
                (ch >= '0' && ch <= '9') ? ch + " character is a digit" : "special character";
    System.out.println(res);
}