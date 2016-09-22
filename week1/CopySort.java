package week1;

import java.util.Arrays;

public class CopySort {
	public static int[] copySort(int[] ns) {
		int b = 0;
		boolean flag = true;
		int[] newns = new int[ns.length];
		for (int i = 0; i < ns.length; i++) {
			newns[i] = ns[i];
		}
		while (flag) {
			flag = false;
			for (int i = 0; i < newns.length - 1; i++) {
				if (newns[i] < newns[i + 1]) {
					b = newns[i];
					newns[i] = newns[i + 1];
					newns[i + 1] = b;
					flag = true;
				}
			} 
		}
		return newns;
	}
	public static void main(String[] args) {
		int[]a = new int[] {2, 7, 1, 0, 10, 16, 33, 21, 20};
		System.out.println(Arrays.toString(copySort(a)));
		System.out.println(Arrays.toString(a));
	}
}
