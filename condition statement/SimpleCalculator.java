/**Create a Simple Calculator using a switch case. */
void main() {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Choose operation:");
        System.out.println("+  Addition");
        System.out.println("-  Subtraction");
        System.out.println("*  Multiplication");
        System.out.println("/  Division");
        System.out.println("%  Modulus");

        System.out.print("Enter operator: ");
        char op = sc.next().charAt(0);

        switch(op) {

            case '+' -> System.out.println("Result = " + (num1 + num2));

            case '-' -> System.out.println("Result = " + (num1 - num2));

            case '*' -> System.out.println("Result = " + (num1 * num2));

            case '/' -> {
                if(num2 != 0)
                    System.out.println("Result = " + (num1 / num2));
                else
                    System.out.println("Division by zero not allowed");
                }

            case '%' -> System.out.println("Result = " + (num1 % num2));

            default -> System.out.println("Invalid operator");
        }
}