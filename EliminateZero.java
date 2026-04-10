/**Eliminate all 0's from a given number*/
void main(){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number : ");
    int num = sc.nextInt();

    int res = 0;
    int place = 1;

    while(num > 0){
        int digit = num % 10;
        System.out.println("d : "+digit);
        if(digit != 0){
            res = res + digit*place;
            place = place * 10;
        }
        num = num/10;
        System.out.println("num : "+num);
    }
    System.out.println(res);
}