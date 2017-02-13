class problem5  {
	public static void main(String[] args) {
		int previousLCM = 1;
		int newValue = 1;
		for (int i = 1 ; i < 20 ; i++ ) {
			newValue = lcm(i,previousLCM);
			previousLCM = newValue;
		}
		
		System.out.println(previousLCM);
		
	}

	public static int lcm(int x, int y) { 
		int lcm = (x*y)/gcd(x,y);
		return lcm;
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b,a%b);
	}	
}
