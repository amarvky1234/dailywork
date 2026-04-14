/*Print two given numbers in descending order.*/
import java.util.Scanner;

void main(){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter first number : ");
	int num1 = sc.nextInt();
	System.out.println("enter second number : ");
	int num2 = sc.nextInt();
	String res = (num1>num2) ? "Descending order is " + num1+","+num2 : "Descending order is " +num2+","+num1;
	System.out.println(res);
}
