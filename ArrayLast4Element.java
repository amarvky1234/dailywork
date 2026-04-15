/**8. Print only the last 4 elements of an array.
  Input: [23, 34, 54, 0, 4, 7] → Output: 54 0 4 7 */
void main() {
    int[] num = {23, 34, 54, 0, 4, 7};
    for(int i=2; i<=num.length-1; i++){
        System.out.print(num[i]+" ");
    }
}