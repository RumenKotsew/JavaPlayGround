package week1;

import java.util.Scanner;

public class ProstiChisla {
	public static boolean isPrime(int n) {
		boolean flag = true;
		if (n < 2) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n%i == 0) {
				System.out.println("if" + i);
				flag = false;
				i = n;
			} 
		}
		return flag;
	}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int a = scanner.nextInt();
	System.out.println(isPrime(a));
	}
}