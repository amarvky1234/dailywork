import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);
    int max, min, num;
    System.out.println("Enter numbers: ");
    num = sc.nextInt();
    max = num;
    min = num;
    for(int i=1; i<5; i++) {
        num = sc.nextInt();
        if(num > max) {
            max = num;
        }
        if(num < min) {
            min = num;
        }
    }
    System.out.println("Maximum number: " + max);
    System.out.println("Minimum number: " + min);
}