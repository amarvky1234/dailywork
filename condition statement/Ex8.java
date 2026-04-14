/*Check if a number is even or odd. */

import java.util.Scanner;

void main(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number :");
	int num = sc.nextInt();
	String res = (num%2 == 0) ? num + " is even number." : num + " is odd number.";
	System.out.println(res);
}