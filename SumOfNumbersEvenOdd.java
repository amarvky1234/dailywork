/**Sum of even/odd numbers between to given numbers */
void main(){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter 1st number : ");
    int num1 = sc.nextInt();
    System.out.print("enter 2nd number : ");
    int num2 = sc.nextInt();

    int sum = 0;

    if(num1<num2){
        for(int i = num1+1; i<num2; i++){
            if(i%2 == 0){
                sum = sum + i;
            }
        }
    }else{
        for(int i = num2+1; i<num1; i++){
            if(i%2 == 0){
                sum += i;
            }
        }
    }
    System.out.println("Sum of numbers between two given numbers is "+sum);
}