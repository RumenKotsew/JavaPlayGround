package week1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class VtorotoNaiMalkoChislo {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[scanner.nextInt()];
		int b = 0;
		int d = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
			if (i == 0) {
				b = a[0];
			}
			if (b > a[i]) {
				b = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (i == 0){
				d = a[i];
			}
			if (d > a[i] && a[i] != b) {
				d = a[i];
			}
		}
		System.out.println(b);
		System.out.println(d);
	}
}
