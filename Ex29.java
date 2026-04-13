import java.util.Scanner;

void main(){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number : ");
	int num = sc.nextInt();
	int i = 1;
	while(i <= num){
	    if(i%2 != 0 && i%3 == 0){
		    System.out.println(i);
	    }
        i++;
	}
}