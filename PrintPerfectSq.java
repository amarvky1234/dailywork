/**24. Print only the perfect squares in an array. */
void main() {
    int[] sq = {4, 5, 9, 13, 25, 29, 36};
    int[] arr1 = new int[sq.length];
    for(int i=0; i<=sq.length-1; i++){
        Double sqrt = Math.sqrt(sq[i]);
        String s = new String(sqrt.toString());
        if(s.length() == 3){
            arr1[i] = sq[i];
        }     
    }
    System.out.println(Arrays.toString(arr1));
}