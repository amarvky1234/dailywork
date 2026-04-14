/*Check if a character is an alphabet or not.*/
import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a character : ");
    char ch = sc.next().charAt(0);

    String res = (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ? "It is an alphabet." : 
     "It is not an alphabet.";
     System.out.println(res);
}