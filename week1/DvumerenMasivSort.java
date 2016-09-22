package week1;

import java.util.Arrays;

public class DvumerenMasivSort {
	public static int[][] sort(int[][] ns) {
		boolean flag = true;
		int c = 0;
		int[] newArray = new int[ns.length];
		int[][] tempArray = new int[ns.length][ns.length];
		for (int i = 0; i < ns.length; i++) {
			for (int j = 0; j < ns[i].length; j++) {
				newArray[i] = newArray[i] + ns[i][j];
			}
		}
	
		while (flag) {
			flag = false;
			for (int i = 0; i < newArray.length - 1; i++) {
				if (newArray[i] < newArray[i + 1]) {
					c = newArray[i];
					newArray[i] = newArray[i + 1];
					newArray[i + 1] = c;
					tempArray[i] = ns[i];
					ns[i] = ns[i + 1];
					ns[i + 1] = tempArray[i];
					flag = true;
				}
			}
		}
		return ns;
	}
	public static void main(String[] args) {
		int[][] a = new int[][] {{10}, {1, 2, 3, 5}, {-8}};
		sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}
}
