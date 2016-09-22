package week1;

import java.util.Scanner;

public class SrednoAritmetichno {
	public static void main(String[] args) {
		double b = 0;
		int d = 0;
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[scanner.nextInt()];
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
			if (a[i] == a[0]) {
				d = a[0];
			}
			b = b + a[i];
			if (d > a[i]) {
				d = a[i];
			}
		}
		b = b / a.length;
		System.out.println(b);
		System.out.println(d);
	}
}