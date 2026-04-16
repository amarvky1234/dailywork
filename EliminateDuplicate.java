/**20. Eliminate duplicates in an array.
  Input: [23, 34, 54, 10, 34, 7, 23] → Output: [23, 34, 54, 10, 7] */
void main() {
    int[] num = {23, 34, 54, 10, 34, 7, 23};
    
    for(int i=0; i<num.length-1; i++){
      boolean isDuplicate = false;

        for(int j=0; j<i; j++){
            if(num[i] == num[j]){
                isDuplicate = true;
                break;
            }
        }
        if(!isDuplicate){
            System.out.print(num[i] +" ");
        }
    }
}