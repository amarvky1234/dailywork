/**21. Create a duplicate array for a given array. */
void main() {
    int[] num = {23, 34, 54, 10, 4, 7};
    int[] dupArr = new int [num.length];
    dupArr=num.clone();

    for(int i=0; i<dupArr.length; i++){
        System.out.print(dupArr[i]+" ");
    }
}