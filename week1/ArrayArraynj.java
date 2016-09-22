package week1;

import java.util.Scanner;

public class ArrayArraynj {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[7];
		int min = a[0];
		int min2 = a[1];
			for (int i = 0; i < 7; i++) {
			a[i] = scanner.nextInt();
				if (min > a[i]) {
					min = a[i];
				}
			}
			for (int i = 0; i < 7; i++) {
				if (min2 > a[i] && a[i] != min) {
					min2 = a[i];
				}
			}
			System.out.println(min2);
	}
}