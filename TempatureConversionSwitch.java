/**Temperature Conversion Celsius To Fahrenheit And Vice Versa */
void main() {
    Scanner sc = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        switch(choice) {

            case 1 -> {
                System.out.print("Enter temperature in Celsius: ");
                double c = sc.nextDouble();
                double f = (9.0/5) * c + 32;
                System.out.println("Temperature in Fahrenheit = " + f);
            }

            case 2 -> {
                System.out.print("Enter temperature in Fahrenheit: ");
                double f1 = sc.nextDouble();
                double c1 = (5.0/9) * (f1 - 32);
                System.out.println("Temperature in Celsius = " + c1);
            }

            default -> System.out.println("Invalid choice");
        }
}