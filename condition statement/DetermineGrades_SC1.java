void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your score : ");
    int score = sc.nextInt();
    int grade = 0;

            if (score >= 65 && score < 100) {
                grade = 1;
            }else if(score >= 50 && score < 65){
                grade = 2;
            }else if(score >= 30 && score < 50){
                grade = 3;
            }
    switch (grade) {
        case 1 ->  System.out.println("First div");

        case 2 -> System.out.println("Second div");
        case 3 -> System.out.println("Third Div");
        default -> System.err.println("Failed");
    }
}