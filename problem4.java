import java.util.*;

class problem4 {
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		int palindrome = 0;


		for (int i = 100; i <= 999 ; i++ ) {
			for (int j = 100; j <= 999 ; j++ ) {
				int product = i * j;
				if (product == reverse(product) && product > palindrome ) {
					palindrome = product;
				}
			}
		}
		long duration = System.currentTimeMillis() - startTime;
		System.out.println(palindrome + "\n" + duration + " milliseconds");
	}

	public static int reverse(int x) {
    	int rev = 0;
    	while(x != 0){
        	rev = rev*10 + x%10;
        	x = x/10;
    	}
    	return rev;
	}
}