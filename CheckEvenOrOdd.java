/**Check whether a number is even or odd using a switch case.*/
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number : ");
    int num = sc.nextInt();

    switch(num%2 == 0 ? 1 : 2) {
        case 1 -> System.out.println(num+ " is a even number");
        case 2 -> System.out.println(num+ " is an odd number");
    }
}