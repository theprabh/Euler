class problem6 {
	public static void main(String[] args) {
		int sumOfSquares = 0;
		double squareOfSum = 0;

		for (int i = 1; i <= 100 ; i++ ) {
			sumOfSquares += Math.pow(i,2);
		}

		for (int i = 1; i <= 100 ; i++ ) {
			squareOfSum += i;
		}
		squareOfSum = Math.pow(squareOfSum,2);
		double totalSum = squareOfSum - sumOfSquares;
		System.out.printf("%.0f%n", totalSum);
	}
}