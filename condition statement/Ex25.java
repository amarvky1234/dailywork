/*Identify whether an input character is a vowel or consonant.*/
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a char : ");
    char ch = sc.next().charAt(0);
    if(ch == 'a'|| ch == 'e' || ch == 'i'|| ch == 'o'|| ch == 'u'|| 
                        ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'){
        System.out.println("given character is vowel");
    } else{
        System.out.println("given character is consonant");
    }
}