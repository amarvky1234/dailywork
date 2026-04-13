void main(){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter 1st number : ");
    int num1 = sc.nextInt();
    System.out.print("enter 2nd number : ");
    int num2 = sc.nextInt();
    int res = 1;

    for(int i=1; i<=num1; i++){
        if(num1%i == 0 || num2%i == 0){
            System.out.println(i);
            res = res*i;
        }
    }
    System.out.println("LCM : "+res);
}