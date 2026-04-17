/**43. Insert an element at a specific position in an array. */
void main(){
    int[] arr = {23, 24, 67, 12, 56, 14};
    System.out.println(Arrays.toString(arr));
    
    int[] newArr = new int[arr.length + 1];

    int pos = 3;
    int element = 33;

    for(int i=0; i<pos; i++){
        newArr[i] = arr[i];
    }
    System.out.println(Arrays.toString(newArr));

    newArr[pos] = element;

    for (int i = pos; i <= arr.length-1; i++) {
       newArr[i+1]  = arr[i];
    }
    System.out.println(Arrays.toString(newArr));
}