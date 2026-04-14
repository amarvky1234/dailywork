
import java.util.Scanner;

/*check if a number is divisible by 7 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String res = (num%7 == 0) ? num + " is divisible by 7" : num + " is not divisible by 7";
        System.out.println(res);
    }
}