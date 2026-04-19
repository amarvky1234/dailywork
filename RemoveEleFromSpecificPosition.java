/**44. Remove an element from a specific position.*/
void main(){
    int[] arr = {11, 12, 14, 15, 16, 8};
    System.out.println(Arrays.toString(arr));
    
    int[] newArr = new int[arr.length-1];

    int pos = 2;
    for(int i=0; i<pos; i++){
        newArr[i] = arr[i];
    }
    System.out.println(Arrays.toString(newArr));
    for(int i =pos; i<arr.length-1; i++){
        newArr[i] = arr[i+1];
    }
    System.out.println(Arrays.toString(newArr));
}