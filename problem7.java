import java.util.*;

class problem7 {
	
	public static void main(String[] args) {

		for (int i = 1, count = 0 ; ; i++) {
			if (isPrimeNumber(i)) {
				count++;
				if (count == 10001) {
					System.out.println(i);
				}
			}
		}

	}

	public static boolean isPrimeNumber(int x) {
		int temp = 0;
		int y = 1;

		while (y <= x) {
			if (x % y == 0) {
				temp++;
			}
			y++;
		}
		return (temp == 2);
	}
}