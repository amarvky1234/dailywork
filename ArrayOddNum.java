/**11. Print only odd numbers from an array.
  Input: [23, 34, 54, 10, 4, 7] → Output: 23 7 */
void main() {
    int[] n = {21,22,23,24,25}; 
    System.out.print("odd number are ");
    for(int i=0; i<=n.length-1; i++){
        if(n[i]%2 != 0){
            System.out.print(n[i]+",");
        }
    }
}