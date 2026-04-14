/*Check if a number has 4 at the unit's place. */
import java.util.Scanner;
void main(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    String rs = (num%10 == 4) ? "Number has 4 at the unit's place." : "Number does not have 4 at the unit's place.";
    System.out.println(rs);
}