void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = sc.nextInt();
    int i = 1;
    int res = 0;
    while(i <= num){
        if(num%i == 0){
            res += i;
            System.out.println(i);
        }
        i++;
    }
    System.out.println("Total number of factors(count) : "+res);
}