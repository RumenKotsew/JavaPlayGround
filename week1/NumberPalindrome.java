package week1;

import java.util.Scanner;

public class NumberPalindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		
		if(a == reverse(a)){
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
	public static int reverse(int a) {
			int lastNumber = 0;
			int result = 0;
		while(a > 0) {
			lastNumber = a % 10;
			a = a / 10;
			result = result*10 + lastNumber;
		}
		return result;
	}
}


