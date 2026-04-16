/**56. Count the total duplicate elements in an array.*/

void main(){
    int[] arr = {1, 2, 3, 1, 4, 2, 5, 1};

    int count = 0;
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    int elementCount = 0;
    for(int i=0; i<arr.length-1; i++){
        if(arr[i] == arr[i+1]) {
            elementCount++;
        } else if(elementCount > 0){
            count++;
            elementCount = 0;
        }
    }
    System.out.println("total duplicate element in an array = "+count);
}