void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number :");
    int num = sc.nextInt();
    int a = 0;
    int b = 1;
    int res = 0;

    while(a < num){
        res = a+b;
        a=b;
        b = res;
    }

    if(a == num){
        System.out.println("Fibonacci");
    }else{
        System.out.println("not");
    } 
}