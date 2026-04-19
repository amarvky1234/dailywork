/**34. Write a program to remove elements that are not in ascending order.
  Input: [12, 34, 11, 56, 37, 98, 23] → Output: [12, 34, 56, 98] */
  void main() {
    int[] arr = {12, 34, 11, 56, 37, 98, 23};

    int num = 0;

    for(int i=0; i<=arr.length-1; i++){
        if(arr[i]>num){
            System.out.print(arr[i]+ " ");
        }
        num = arr[i];
    }
  }