package week1;

import java.util.Scanner;

public class SortShort {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			for (int k = 0; k < a.length; k++) {
				if (a[i] < a[k]) {
					int c = a[i];
					a[i] = a[k];
					a[k] = c;
				}
			}
		}
		
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
	}	
}
