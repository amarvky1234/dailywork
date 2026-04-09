void main(){
    int rows =5;
    for(int i =1; i<=rows; i++){
        // Print leading spaces
		for (int j = 1; j <= rows - i; j++) {
			System.out.print(" ");
		}

		// Print stars with a space after each
		for (int k = 1; k <= i; k++) {
			System.out.print("* ");
		}
		// Move to the next line
		System.out.println();
    }
}