void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = sc.nextInt();

    int res = (num/100) % 10;
    System.out.println("number at 100's place : "+res);
}