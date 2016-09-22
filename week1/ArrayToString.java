package week1;

import java.util.Scanner;

public class ArrayToString {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int[] Arr = new int [scanner.nextInt()];
		char[] Carr = new char [Arr.length]; 
		for (int i = 0; i < Arr.length; i++) {
			Arr[i] = scanner.nextInt();
			Carr[i] = (char)(Arr[i] + '0');
		}
		System.out.println(Carr);
	}
}
