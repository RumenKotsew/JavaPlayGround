package week1;

public class Programing0Exam1 {
	public static int secondLargest(int[] pile) {
		int value = 0;
		int secondValue = 0;
			for (int k = 0; k < pile.length; k++) {
				if (pile[k] < value) {
					value = pile[k];
					secondValue = pile[k];
				}
			}
			for (int i = 0; i < pile.length; i++) {
				if (pile[i] > value) {
					value = pile[i];
				}
			}
			for (int j = 0; j < pile.length; j++) {
				if (secondValue < pile[j] && pile[j] != value) {
					secondValue = pile[j];
				}
			}
			return secondValue;
	}

	public static void main(String[] args) {
		int[] a = {-1, -4, -3, -10, -10};
		System.out.println(secondLargest(a));
	}
}