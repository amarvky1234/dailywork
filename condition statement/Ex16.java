/*Print three given numbers in descending order. */
import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter three numbers : ");
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 = sc.nextInt();

    if (n1 >= n2 && n1 >= n3) {
        System.out.print(n1 + " ");
        if (n2 >= n3) {
            System.out.print(n2 + " " + n3);
        } else {
            System.out.print(n3 + " " + n2);
        }
    } else if (n2 >= n1 && n2 >= n3) {
        System.out.print(n2 + " ");
        if (n1 >= n3) {
            System.out.print(n1 + " " + n3);
        }else {
            System.out.print(n3 + " " + n1);
        }
    }else{
        System.out.print(n3 + " ");
        if (n1 >= n2) {
            System.out.print(n1 + " " + n2); 
        }else {
            System.out.print(n2 + " " + n1);
        }
    }
}