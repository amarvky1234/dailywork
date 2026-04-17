/**Find all numbers greater than a given number.
  Input: [23, 34, 54, 10, 4, 7], Threshold: 20 → Output: 23, 34, 54 */
void main() {
    int[] num = {23, 34, 54, 10, 4, 7};
    for(int i=0; i<=num.length-1; i++){
        if(num[i] > 20){
            System.out.print(num[i] + " ");
        }
    }
}