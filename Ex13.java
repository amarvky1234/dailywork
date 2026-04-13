void main() {
    int i = 1;
    /*while(i <= 40) {
        if(i%4 == 0){
            System.out.println(i);
        }
        i++;
    }*/
   System.out.print("multiples of 4 are ");
   while(i <= 10) {
        int mul = 4 * i;
        System.out.print(mul+",");
        i++;
   }
}