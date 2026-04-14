/**Print total number of days in a month using switch case. */
void main() {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        switch(month) {

            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 days");
            case 4, 6, 9, 11 -> System.out.println("30 days");
            case 2 -> System.out.println("28 or 29 days");
            default -> System.out.println("Invalid month number");
        }
}