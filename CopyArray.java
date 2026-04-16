/**7. Store an array into another array (copy array).
  Input: ar = [23, 34, 54, 10, 4, 7] → Output: br = [23, 34, 54, 10, 4, 7] */
void main() {
    int[] num = {23, 34, 54, 10, 4, 7};

    int[] copyNum =num;
    System.out.println(Arrays.toString(copyNum));

    for(int i=0; i<=copyNum.length-1; i++){
        System.out.print(copyNum[i]+" ");
    }
}