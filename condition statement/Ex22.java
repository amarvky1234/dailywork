/*Voting eligibility checker. */
import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your name : ");
    String name = sc.nextLine();
    System.out.print("Enter your age : ");
    int age = sc.nextInt();
    System.out.print("Have You a Voter ID card : ");
    boolean voterID = sc.nextBoolean();

    String res = (age >= 18 && voterID) ? "You are eligible to vote" : "You are not eligible to vote";
    System.out.println(res);
}