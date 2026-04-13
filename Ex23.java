import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    for(int i=num; i>=1; i--){
        if(num % i == 0){
            System.out.print(i+",");
        }
    }
}