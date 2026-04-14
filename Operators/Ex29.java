/**Given the cost of a product as ₹538.56, add 18% GST to it and print the total cost. */
void main() {
    double cost = 538.56;
    double gst = (538.56*18)/100;
    double tCost = cost + gst;
    System.out.println("total cost Rs"+tCost);
}