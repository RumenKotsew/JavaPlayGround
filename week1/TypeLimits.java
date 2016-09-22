package week1;

import java.util.Scanner;

public class TypeLimits {
	public static void main(String[] args) {
		int[] a = new int[5];
		int b;
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("Input number" + i);
			a[i] = scanner.nextInt();
		}
		b = a[0];
		for (int i = 0; i < 5; i++) {
		
			if (b > a[i]) {
				b = a[i];
			}
		}
	System.out.println(b);
	System.out.println(a);
	}
	//[I@55f96302
}

