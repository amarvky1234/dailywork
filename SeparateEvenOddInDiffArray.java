/**60. Separate even and odd elements into two different arrays. */
void main(){
    int[] arr = {7, 8, 9, 10, 11, 12};

    int k1 = 0;
    int k2 = 0;

    for(int i=0; i<=arr.length-1; i++){
        if(arr[i]%2 == 0){
            k1++;
        }else{
            k2++;
        }
    }

    int[] evenArr = new int[k1];
    int[] oddArr = new int[k2];

    int a =0; 
    int b =0;
    for(int i=0; i<=arr.length-1; i++){
        if(arr[i]%2 == 0){
            evenArr[a++] = arr[i];
        }else{
            oddArr[b++] = arr[i];
        }
    }
    System.out.println(Arrays.toString(evenArr));
    System.out.println(Arrays.toString(oddArr));
}