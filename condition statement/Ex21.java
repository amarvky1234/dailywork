/*Check if a date is valid or not.*/
import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a date : ") ;
    String date = sc.nextLine();
    String[] parts = date.split("/");
    int day = Integer.parseInt(parts[0]);
    int month = Integer.parseInt(parts[1]);
    int year = Integer.parseInt(parts[2]);
    boolean isValid = true;
    if (month < 1 || month > 12) {
        isValid = false;
    } else if (day < 1 || day > 31) {
        isValid = false;
    } else if (month == 2) {
        if (isLeapYear(year)) {
            if (day > 29) {
                isValid = false;
            }
        } else {
            if (day > 28) {
                isValid = false;
            }
        }
    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
        if (day > 30) {
            isValid = false;
        }
    }
}