/**calculator */
void main() {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char op = sc.next().charAt(0);

        switch(op) {

            case '+' -> System.out.println("Result = " + (num1 + num2));

            case '-' -> System.out.println("Result = " + (num1 - num2));

            case '*' -> System.out.println("Result = " + (num1 * num2));

            case '/' -> System.out.println("Result = " + (num1 / num2));

            case '%' -> System.out.println("Result = " + (num1 % num2));

            default -> System.out.println("Invalid operator");
        }
}