/**5. Print all numbers in reverse order (last index to first index).
  Input: [23, 34, 54, 0, 4, 7] → Output: 7 4 0 54 34 23 */
void main() {
    int[] num = {23, 34, 54, 0, 4, 7};
    System.out.println("array length : "+num.length);
    
    for(int i = num.length-1; i>=0; i--){
        System.out.print(num[i]+" ");
    }
}