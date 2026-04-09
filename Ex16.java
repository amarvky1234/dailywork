void main(){
    int rows = 5;
    int n = 1;
    for(int i=1; i<=rows; i++){
        for(int j=1; j<=rows-i; j++){
            System.out.print(" ");
        }
        for(int k=1; k<=i; k++){
            System.out.print(n+" ");
            n++;
        }
        System.out.println();
    }
}