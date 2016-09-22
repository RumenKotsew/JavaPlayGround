package week1;

import java.util.Scanner;

public class ShapesAndSizes2 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = 5;
		if (x >= 0 && x <= 5 && y <= 5 && y >= -5 && (x*x + y*y) <= z*z) {
			System.out.println("inside mdfk");
		} else {
			if (x >= -10 && x < 0 && y <= 5 && y >= -5) {
				System.out.println("inside mdfk");
			} else {
				System.out.println("outside deiba");
			}
		}
	}
}
