/**33. Print the greatest of all 2-digit numbers in an array. */
void main(){
    int[] arr = {12, 35, 123, 45, 7, 9};

    int[] twoDigit = new int[arr.length];

    for(int i=0; i<=arr.length-1; i++){
        if(arr[i]>=10 && arr[i] <=99){
            twoDigit[i] = arr[i];
        }
    }
    Arrays.sort(twoDigit);
    System.out.println("Greatest two digit number in array is "+twoDigit[arr.length-1]);

    int max = 0;
    for (int i = 0; i <= arr.length-1; i++) {
       if(arr[i]>=10 && arr[i] <= 99 && arr[i]>max) {
            max = arr[i];
       }
    }
    System.out.println("max 2digit number is "+max);
}