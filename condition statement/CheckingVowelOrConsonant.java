/**Check whether an alphabet is a vowel or consonant using a switch case. */
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a alphabet : ");
    char ch = sc.next().charAt(0);

    switch(ch){
        case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> System.out.println(ch+"  is a vowel");
        default -> System.out.println(ch+ " is a consonant");
    }
}