import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    int i = 1;
    while(i<=num){
        if(i%2 == 0 && i%3 == 0) { 
            System.out.println(i);
        }
        i++;
    }
}