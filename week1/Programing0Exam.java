package week1;

public class Programing0Exam {
	public static String lossOrProfit(int[] income, int[] outcome) {
		int incsum = 0;
		int outsum = 0;
		int result = 0;
		String resultString = new String();
		for (int i = 0; i < income.length; i++) {
			incsum = incsum + income[i];
		}
		for (int i = 0; i < outcome.length; i++) {
			outsum = outsum + outcome[i];
		}
		result = incsum - outsum;
		resultString = result + "";
		if (result > 0) {
			resultString = "+" + resultString;
		}
		if (result == 0) {
			resultString = "=" + result;
		}
		return resultString;
	}
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		int[] b = {6};
		System.out.println(lossOrProfit(a, b));
	}
}
