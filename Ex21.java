import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.println("Enter a number: ");
    for(int i=1; i<=5; i++) {
        num = sc.nextInt();
        if(num%2==0) {
            System.out.println(num + " is even.");
        }
    }
    sc.close();
}