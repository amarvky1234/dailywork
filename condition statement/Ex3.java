/*Check if a number is a factor of 96 */
import java.util.Scanner;
void main(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    String res = (96 % num == 0) ? num + " is a factor of 96" : num + " is not a factor of 96";
    System.out.println(res);
}