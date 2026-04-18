/**34. Print odd numbers divisible by 3.*/
void main(){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter size of array : ");
    int size = sc.nextInt();
    System.out.println("enter array elements : ");
    int[] arr = new int[size];

    for(int i=0; i<=arr.length-1; i++){
        arr[i] = sc.nextInt();
    }
    System.out.println(Arrays.toString(arr));

    System.out.println("Elements that is divisble by 3 : ");
    for(int i=0; i<=arr.length-1; i++){
        if(arr[i]%2 != 0  && arr[i]%3 == 0){
            System.out.print(arr[i]+" ");
        }
    }
}