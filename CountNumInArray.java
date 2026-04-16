/**18. Find the total number of times an element appears in an array.
  Input: [23, 34, 54, 10, 34, 7, 23], Query: 34 → Output: 2 */
void main() {
    int[] num = {23, 34, 54, 10, 34, 7, 23};
    int count = 0;
    for(int i=0; i<=num.length-1; i++){
        if(num[i] == 34){
            count++;
        }
    }
    System.out.println(count);
}