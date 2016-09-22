package week1;

public class Programming0Exam2 {
	public static String decode(char[][] word) {
		char[] result = new char[word.length];
		for (int i = 0; i < word.length; i++) {
			for (int j = 0; j < 2; j++) {
				if (j == 1) {
					result[i] = word[i][j];
				}
			}
		}
		String resultStr = new String(result);
		return "" + resultStr;
	}
	public static void main(String[] args) {
		char[][] a = new char[][] {
								{'b', 'a'},
								{'b', 'a'}
//								{'h', 'i'},
//								{'p', 'm'},
//								{'y', 'j'},
//								{'o', 'e'},
//								{'t', 'r'},
//								{'n', 'w'}
		};
		System.out.println(decode(a));
	}
}
