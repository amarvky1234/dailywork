void main(){
    String binary = "1000";
    int decimalNum = Integer.parseUnsignedInt(binary, 2);
    System.out.println(binary+" : "+decimalNum);
}