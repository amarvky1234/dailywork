/**check if a number is palindrome*/
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number : ");
    int num = sc.nextInt();
    int rev = 0;

    int k = num;
    while(k != 0 && k >0){
        int digit = k%10;
        rev = rev*10 + digit;
        k = k/10;
    }

    if(num == rev){
        System.out.println("number is palindrome");
    }else{
        System.out.println("number is not palindrome");
    }
}