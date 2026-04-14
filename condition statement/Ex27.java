/*Check if a character is uppercase or lowercase.*/
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a char : ");
    char ch = sc.next().charAt(0);

    if(ch >= 'A' && ch <= 'Z'){
        System.out.println("character is uppercase");
    }else if(ch >= 'a' && ch <= 'z'){
        System.out.println("character is lowercase");
    }else {
        System.out.println("invalid character");
    }
}