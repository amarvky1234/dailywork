/**2. Print all the array values using a for loop.
  Input: [23, 34, 54, 0, 4, 7] → Output: 23 34 54 0 4 7 */
void main() {
    int[] num = {23, 34, 54, 0, 4, 7};
    System.out.println("array length : "+num.length);

    for(int i=0; i<=num.length-1; i++){
        System.out.print(num[i]+" ");
    }
}