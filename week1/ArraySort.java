package week1;

import java.util.Scanner;

public class ArraySort {
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	int[] a = new int[10];
	int x = 0;
	int y = 0;
	boolean flag = true;
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		while (flag) {
			flag = false;
			for (int i2 = 0; i2 < a.length -1; i2++) {
				if (a[i2] > a[i2 + 1]) {
					y = a[i2 + 1];
					a[i2 + 1] = a[i2];
					a[i2] = y;
					flag = true;
				}
			}
		}	
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}

