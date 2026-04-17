/**65. For the given arrays solve the following
var ar = [19,12,23,4,15];
var br = [26,37,18,79,10];
 a)Write script to merge array as the values of ar in the first and values of br next
 Expected output: [19,12,23,4,15,26,37,18,79,10];

 b)Write script to merge array as the values of ar in the first and values of br next
 Expected output: [26,,37,18,79,10,19,12,23,4,15]; */
 void main(){
    int[] ar = {19, 12, 23, 4, 15};
    int[] br = {26, 37, 18, 79, 10};

    int[] arr1 = new int[ar.length + br.length];
    int a = 0;
    for(int i =0; i<=ar.length-1; i++){
        arr1[i] = ar[i];
        a++;
    }
    for(int i=0; i<=br.length-1; i++){
        arr1[i+a] = br[i];
    }
    System.out.println("arr1 : "+Arrays.toString(arr1));


    int[] arr2 = new int[ar.length + br.length];
    int b = 0;
    for(int i=0; i<=br.length-1 ; i++){
        arr2[i] = br[i];
        b++;
    }
    for(int i=0; i<=ar.length-1; i++){
        arr2[i+b] = ar[i];
    }
    System.out.println("arr2 : "+Arrays.toString(arr2));
 }