/*Find the least number among three numbers*/
import java.util.Scanner;

void main(){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter first number : ");
	int num1 = sc.nextInt();
	System.out.println("enter second number : ");
	int num2 = sc.nextInt();
	System.out.println("enter third number : ");
	int num3 = sc.nextInt();
	String res = (num1<num2 && num1<num3) ? "The least number among three is " +num1 : (num2<num1 && num2<num3) ? "The least number among three is " +num2 : "The least number among three is " +num3;
	System.out.println(res);
}