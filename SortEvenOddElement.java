/**63. Sort even and odd elements separately.*/
void main(){
    int[] arr = {123, 100, 56, 67, 88, 23, 24};

    int evenLength = 0;
    int oddLength = 0;

    for(int i=0; i<=arr.length-1; i++){
        if(arr[i]%2 == 0){
            evenLength++;
        }else{
            oddLength++;
        }
    }

    int[] evenArr = new int[evenLength];
    int[] oddArr = new int[oddLength];

    int k1 = 0;
    int k2 = 0;

    for(int i=0; i<=arr.length-1; i++){
        if(arr[i]%2 == 0){
            evenArr[k1++] = arr[i];
        }else{
            oddArr[k2++] = arr[i];
        }
    }

    System.out.print("Even element array : "+Arrays.toString(evenArr));System.out.println("");
    System.out.print("odd element array : "+Arrays.toString(oddArr));
    System.out.println();

    Arrays.sort(evenArr);
    Arrays.sort(oddArr);
    System.out.print("Sorted even element : "+Arrays.toString(evenArr));System.out.println("");
    System.out.print("Sorted odd element : "+Arrays.toString(oddArr));
}