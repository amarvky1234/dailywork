import java.util.Scanner;
void main(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = sc.nextInt();
    int i = num;
    while(i >= 1){
        if (i%2 != 0){
            System.out.print(i+",");
        }
        i--;
    }
}