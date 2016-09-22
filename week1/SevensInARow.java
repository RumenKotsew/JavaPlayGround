package week1;

public class SevensInARow {
	public static boolean sevensInARow(int[] a,int n) {
		boolean flag = false;
		int sumsum = 0;
		int result = 0;
		for (int i = 0;i < a.length; i++) {
			if (a[i] == 7 && i <= a.length - n) {
				sumsum = 7;
				for (int j = 1; j < n; j ++) {
					System.out.println("for" + i + "time" + sumsum);
					if (a[i + j] == 7) {
						sumsum = sumsum + 7;
						System.out.println("if" + sumsum);
					} else {
						sumsum = 7;
						System.out.println("else" + sumsum);
					}
					if (sumsum == 7*n) {
						result = result + 1;
					}
				}
			}
		}
		if (result > 0) {
			flag = true;
		}
		System.out.println(result + "times");
		return flag;
	}
	public static void main(String[] args) {
		int[] b = new int[] {7, 7, 8, 7, 7, 7};
		int c = 3;
		System.out.println(sevensInARow(b, c));
	}
}
