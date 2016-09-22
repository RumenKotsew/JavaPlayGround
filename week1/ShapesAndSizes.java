package week1;

import java.util.Scanner;

public class ShapesAndSizes {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = 5;
		if ((x*x + y*y) > z*z) {
			System.out.println("outside mdfk");
		} else {
			System.out.println("inside mdfk");
		}
	}
}
