/**40. Merge two arrays with values of the first array appearing first. */
void main() {
    int[] arr1 = {1, 2, 3, 4, 5};
    int[] arr2 = {6, 7, 8, 9, 10};

    int[] mergedArr = new int[arr1.length + arr2.length];
    int k = 0;

    for(int i=0; i<=arr1.length-1; i++){
        mergedArr[i] = arr1[i];
        k++;
    }

    for(int i=0; i<=arr2.length-1; i++){
        mergedArr[k+i] = arr2[i];
    }

    System.out.println(Arrays.toString(mergedArr));
}