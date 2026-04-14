/**Find Radius, Circumference and Volume of Cylinder*/
void main() {
    Scanner sc = new Scanner(System.in);

        System.out.println("1. Find Circumference of Circle");
        System.out.println("2. Find Volume of Cylinder");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch(choice) {

            case 1 -> {
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                double circumference = 2 * 3.14 * r;
                System.out.println("Circumference = " + circumference);
        }

            case 2 -> {
                System.out.print("Enter radius: ");
                double r1 = sc.nextDouble();
                System.out.print("Enter height: ");
                double h = sc.nextDouble();
                double volume = 3.14 * r1 * r1 * h;
                System.out.println("Volume of Cylinder = " + volume);
        }

            default -> System.out.println("Invalid choice");
        }
}