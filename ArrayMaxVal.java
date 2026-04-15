/**13. Find the maximum number in an array.
 Input: [23, 34, 54, 10, 4, 7] → Output: 54 */
void main() {
    int[] num = {23, 34, 54, 10, 4, 7};
    int max = num[0];
    for(int i=1; i<=num.length-1; i++){
        if(num[i] > max){
            max = num[i];
        }
    }
    System.out.println("min value : "+max);
}