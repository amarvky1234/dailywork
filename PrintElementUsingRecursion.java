/**47. Read and print elements of an array using recursion. */
void printArr(int[] arr, int index){
    if(index == arr.length){
        return;
    }
    System.out.print(arr[index]+" ");

    printArr(arr, index + 1);
}
void main(){
    int[] arr = {10, 20, 30, 40, 50};

    printArr(arr, 0);
}