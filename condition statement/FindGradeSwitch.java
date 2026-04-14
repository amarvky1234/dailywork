/*Find A Grade Of Given Marks or (Find a Grade of Given Marks Using Switch Case)*/
void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        int grade = marks / 10;

        switch(grade) {

            case 10, 9 -> System.out.println("Grade A");
            case 8 -> System.out.println("Grade B");

            case 7 -> System.out.println("Grade C");

            case 6 -> System.out.println("Grade D");

            default -> System.out.println("Fail");
        }
}
