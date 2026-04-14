/**Print day of week name using switch case.*/
void main(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter week name : ");
    String weekNm = sc.nextLine();

    switch(weekNm){
        case "Sunday" -> System.out.println("1st day of week");
        case "Monday" -> System.out.println("2nd day of week");
        case "Tuseday" -> System.out.println("3rd day of week");
        case "Wednesday" -> System.out.println("4th day of week");
        case "Thursday" -> System.out.println("5th day of week");
        case "Friday" -> System.out.println("6th day of week");
        case "Saturday" -> System.out.println("7th day of week");
        default -> System.out.println("invalid week name");
    }
}