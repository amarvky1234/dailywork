/**58. Merge two arrays into a third array.*/
void main(){
    int[] arr1 = {12, 14, 14, 11, 5};
    int[] arr2 = {9, 99, 999, 7, 23};

    int[] arr3 = new int[arr1.length + arr2.length];
    int k = 0;

    for(int i=0; i<=arr1.length-1; i++){
        arr3[i] = arr1[i];
        k++;
    }

    for(int i=0; i<=arr2.length-1; i++){
        arr3[i+k] = arr2[i];
    }

    System.out.println(Arrays.toString(arr3));
}