/**33. Deduct tax:
  10% for salaries < 50000, 12% for salaries > 50000. */
void main(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size of an array");
    int size = sc.nextInt();
    System.out.println("enter salaries : ");
    double[] arr = new double[size];

    for(int i=0; i<=arr.length-1; i++){
        arr[i] = sc.nextDouble();
    }
    System.out.println(Arrays.toString(arr));

    System.out.println("");
    for(int i=0; i<=arr.length-1; i++){
        if(arr[i]<50000){
            double sal = arr[i]-(arr[i]*10/100);
            System.out.print(sal+"  ");
        }else{
            double sal = arr[i]-(arr[i]*12/100);
            System.out.print(sal+"   ");
        }
   }

   sc.close();
}