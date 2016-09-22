package week1;

import java.util.Scanner;

public class ShorterSort {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int [] a = new int[] {0,1,2,5,7,10,11,20,33,85};
		int num = 33;
		int left = 0;
		int right = a.length;
		int mid = a.length / 2;
		boolean flag = true;
		while (flag) {
			flag = false;
			if (a[mid] > num) {
				right = mid;
				mid = (mid + left) / 2;
			flag = true;
			}
			if (a[mid] < num) {
				left = mid;
				mid = (left + right) / 2;
				flag = true;
			}
			if (a[mid] == num) {
				System.out.println(a[mid]);
				flag = false;
			}
		}
	}
}
