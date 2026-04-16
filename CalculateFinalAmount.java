/**30. For each salary, calculate the final amount after adding 40% HRA, 92% DA, and 
  deducting 10% tax. */
void main(){
    double[] sal = {25000, 38000, 56000, 57000, 60000};

    System.out.println("For each salary, the final amount after adding 40% HRA, 92% DA, and" 
           +" deducting 10% tax");
    for(int i=0; i<=sal.length-1; i++){
        double amount = sal[i]+(sal[i]*40/100 + sal[i]*92/100);
        double tax = sal[i]*10/100;
        double finalAmt = amount - tax;
        System.out.println("sal : "+sal[i] +"         final amount : "+finalAmt);
    }
}