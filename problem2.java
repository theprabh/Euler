class problem2 {
	
	public static void main(String[] args) {
		int sum = 0;
		int fibvalue = 1;
		int lastvalue = 1;
		int newvalue = 0;

		while (sum < 4000000) {
			if (fibvalue % 2 == 0) {
				sum += fibvalue;
			}

			newvalue = fibvalue + lastvalue;
			lastvalue = fibvalue;
			fibvalue = newvalue;
		}

		System.out.println(sum);
	}
}