/**15. Find the average of all elements in an array.
  Input: [23, 34, 54, 10, 4, 7] → Output: 22 */
void main() {
    int[] num = {23, 34, 54, 10, 4, 7};
    int sum = 0;
    for(int i=0; i<=num.length-1; i++){
        sum += num[i];
    }
    System.out.println("Sum of Array Element : "+sum);
    double avg = sum/num.length;
    System.out.println("Avg of Array Elemnent : "+avg);
}