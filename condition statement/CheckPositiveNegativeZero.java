/**Check whether a number is positive, negative or zero using a switch case.*/
void main(){
   Scanner sc = new Scanner(System.in);
   System.out.println("enter a number : ");
   int num = sc.nextInt();

    switch(num>0 ? 1 : num<0 ? 2 : 3){
        case 1 -> System.out.println(num+ " is positive number");
        case 2 -> System.out.println(num+ " is negative number");
        case 3 -> System.out.println("number is zero");
    }

    /*switch (Integer.signum(num)) {

            case 1 -> System.out.println("Number is Positive");

            case -1 -> System.out.println("Number is Negative");

            case 0 -> System.out.println("Number is Zero");
    }*/
}