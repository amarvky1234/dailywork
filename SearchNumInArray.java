/**17. Search if a number exists in an array.
  Input: [23, 34, 54, 10, 4, 7], Query: 34 → Output: true */
void main() {
    int[] num = {23, 34, 54, 10, 4, 7};
    for(int i=0; i<=num.length-1; i++){
        if(num[i] == 34){
            System.out.println("true");
        }
    }
}