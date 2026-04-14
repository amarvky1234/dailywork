/*Input a week number and print the corresponding weekday.*/
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter week number : ");
    int weekNum = sc.nextInt();

    if(weekNum == 1){
        System.out.println("Sunday");
    }else if(weekNum == 2){
        System.out.println("Monday");
    }else if(weekNum == 3){
        System.out.println("Tuesday");
    }else if(weekNum == 4){
        System.out.println("Wednesday");
    }else if(weekNum == 5){
        System.out.println("Thursday");
    }else if(weekNum == 6){
        System.out.println("Friday");
    }else if(weekNum == 7){
        System.out.println("Saturday");
    }else{
        System.out.println("invalid week number");
    }
}