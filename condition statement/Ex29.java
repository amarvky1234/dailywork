/*Input a month number and print the number of days in that month.*/
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter month number : ");
    int monthNum = sc.nextInt();

    if(monthNum == 1){
        System.out.println("Number of days is 31");
    }else if(monthNum == 2){
        System.out.println("Number of days is 28");
    }else if(monthNum == 3){
        System.out.println("Number of days is 31");
    }else if(monthNum == 4){
        System.out.println("Number of days is 30");
    }else if(monthNum == 5){
        System.out.println("Number of days is 31");
    }else if(monthNum == 6){
        System.out.println("Number of days is 30");
    }else if(monthNum == 7){
        System.out.println("Number of days is 31");
    }else if(monthNum == 8){
        System.out.println("Number of days is 31");
    }else if(monthNum == 9){
        System.out.println("Number of days is 30");
    }else if(monthNum == 10){
        System.out.println("Number of days is 31");
    }else if(monthNum == 11){
        System.out.println("Number of days is 30");
    }else if(monthNum == 12){
        System.out.println("Number of days is 31");
    }else{
        System.out.println("invalid month number");
    }
}