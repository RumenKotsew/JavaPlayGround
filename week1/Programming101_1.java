package week1;

public class Programming101_1 {
	public static int sumWaterAmountInLitres(String pathString) {
		char[] path = pathString.toCharArray();
		int counter = 0;
		int level = 0;
		int totalSumOfLitres = 0;
		
			for (int i = 0; i < path.length; i++) {
				if (path[i] == 'd') {
					level++;
					if (level >= 0) {
						counter = counter + level;
						System.out.println("d" + counter + "turn" + i);
					}
				}
				if (path[i] == 'h') {
					if (level >= 0) {
						counter = counter + level;
						System.out.println("h" + counter + "turn" + i);
					}
				}
				if (path[i] == 'u') {
					level--;
					if (level >= 0) {
						counter = counter + level;
						System.out.println("u" + counter + "turn" + i);
					}
				}
			}
			totalSumOfLitres = counter * 1000;
		return totalSumOfLitres;
	}
	public static void main(String[] args) {
		String input = "dddhhhuuhhuuuhdddduu";
		System.out.println(sumWaterAmountInLitres(input));
	}
}
