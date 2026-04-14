/*Input angles of a triangle and check whether the triangle is valid. */
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter all three angles : ");
    int ang1 = sc.nextInt();
    int ang2 = sc.nextInt();
    int ang3 = sc.nextInt();

    if ((ang1 + ang2 + ang3) == 180){
        System.out.println("Valid Trinagle");
    }else{
        System.out.println("Not a valid Triangle");
    }
}