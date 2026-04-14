/*Check if a character is a vowel or consonant.*/
import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Character : ");
    char ch  = sc.next().charAt(0);

    String res = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || 
    ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ? ch + " is a Vowel" : ch + " is a Consonant";
    System.out.println(res);
}