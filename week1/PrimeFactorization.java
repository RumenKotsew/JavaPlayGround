package week1;

public class PrimeFactorization {
	public static void main (String[] args) {
		int n = 14653746;
		int box = n;
		int[] array1 = new int[n + 1];
		for (int i = 2; i <= n; i ++) {
			if (box%i > 0) {
				i++;
			}
			while (box%i == 0) {
			box = box/i;
			array1[i] = array1[i] + 1;
			}
		}
		for (int j = 0; j < array1.length; j++) {
			if (array1[j] != 0) {
				System.out.println(j + "^" + array1[j]);
			}
		}
	}
}