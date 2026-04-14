/**Find the maximum between two numbers using the switch case.*/
void main() {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        switch(num1 > num2 ? 1 : 2) {

            case 1 -> System.out.println("Maximum number is: " + num1);

            case 2 -> System.out.println("Maximum number is: " + num2);
        }
}