/**Implement a switch case to perform operations (+, -, *, /, %).  */
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter two numbers : ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    System.out.println("choose operation : +, -, *, / and %");
    char op = sc.next().charAt(0);

    switch (op) {
        case '+' -> System.out.println(num1 + num2);
        case '-' -> System.out.println(num1 - num2);
        case '*' -> System.out.println(num1 *num2);
        case '/' -> System.out.println(num1 / num2);
        case '%' -> System.out.println(num1 % num2);
        default -> System.out.println("invalid operator");
    }
}