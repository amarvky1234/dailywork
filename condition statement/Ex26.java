/*Identify whether an input character is an alphabet, digit, or special character.*/
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("input a char : ");
    char ch = sc.next().charAt(0);

    if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
        System.out.println(ch + "  is an alphabet");
    }else if(ch >='0' && ch <='9'){
        System.out.println(ch + " is digit");
    }else{
        System.out.println("special characters");
    }
}