/*Find the greatest number among two numbers.*/  

import java.util.Scanner;

void main(){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter first number : ");
	int num1 = sc.nextInt();
	System.out.println("enter second number : ");
	int num2 = sc.nextInt();
	String res = (num1>num2) ? num1 + " is greatest" : 
                                            (num2>num1) ? num2 + " is greatest" : "both numbers are equal";
	System.out.println(res);
}