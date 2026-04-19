/**22. Reduce each element of an array by 25% and store in another array. */
void main() {
    double[] arr1 = {12.5, 13, 23.0, 30, 15};

    for(int i=0; i<= arr1.length-1; i++){
        System.out.println(arr1[i] +" reduce by 25% "+" : "+(25*arr1[i])/100);
    }

    double[] arr2 = arr1.clone();
    System.out.println(Arrays.toString(arr2));
}