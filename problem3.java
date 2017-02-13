class problem3 {
	
	public static void main(String[] args) {
		double num = 600851475143.0;
		double product = 1;
		double value = 1;

		while (product != num) {
			if (num % value == 0 ) {
				product = value * product;
			}
			value++;
		}

		System.out.println("The largest prime factor of " + num + " is " + (value - 1) );
	}
}