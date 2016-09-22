package week1;

import java.util.Arrays;

public class CinemaSeats {
	public static int findSeatRow(int[] ns) {
		int result = 1000;
		int index = 0;
		for (int i = 0; i < ns.length; i++) {
			if (ns[i] < result && ns[i] != 0) {
				result = ns[i];
				index = i;
			}
		}
		for (int i = 0; i < ns.length; i++) {
			if (i == index) {
				ns[i] = 0;
			}
		}
		System.out.println(index);
		return index;
	}
	public static int findSeatNumber(int[][] orderList, int row) {
		int temp = 0;
		for (int i = 0; i < orderList.length; i++) {
			if (orderList[i][0] == row) {
				temp = orderList[i][1];
				orderList[i][0] = 0;
				i = orderList.length; //problema e nqkyde w tazi funkciq poneje ponqkoga izkarva 0 nz zashto
			}
		}
		System.out.println(temp + "towa e temp");
		return temp;
	}
	public static int[][] fillEmUpMain(int[][] cinema ) {
		int mounter = 0;
		for (int i = 0; i < cinema.length; i++) {
			for (int j = 0; j < cinema.length; j++) {
				if (cinema[i][j] == 0) {
					mounter++;
				}
			}
		}
		int[][] order = new int[mounter][2];
		int orderRow = 0;
		int[] arrangement = new int[cinema.length + 1];

		for (int i = 0; i < cinema.length; i++) {
			for (int j = 0; j < cinema.length; j++) {
				if (cinema[i][j] == 0) {
					order[orderRow][0] = i + 1;
					order[orderRow][1] = j + 1;
					orderRow = orderRow + 1;
				}
			}
		}
		for (int i = 0; i < order.length; i++) {
			if (i == 0 || order[i-1][0] != order[i][0]) {
				int counter = 0;
				for	(int k = i; k < order.length; k++) {
					if(order[k][0] == order[i][0]) {
						counter++;
					}
				}
				arrangement[order[i][0]] = counter;
			}
		}
		for (int i = 0; i < order.length; i++) {
			
			System.out.println(Arrays.toString(order[i]));
		}
		System.out.println(Arrays.toString(arrangement));
		int[][] newOrder = new int[order.length][2];
		for (int i = 1; i < newOrder.length - 1; i++) {
			newOrder[i][0] = findSeatRow(arrangement);
			for (int j = 0; j < order.length - 1; j++) {
				if (order[j][0] == newOrder[i][0]) {
					while (order[j + 1][0] == order[j][0] && i != newOrder.length - 1) {
						newOrder[i + 1][0] = newOrder[i][0];
						order[j][0] = 0;
						i++;
					}					
				}
			}
		}
		for (int j = 0; j < newOrder.length; j++) {
			
			newOrder[j][1] = findSeatNumber(order, newOrder[j][0] );
		}
		System.out.println(Arrays.toString(arrangement));
		return newOrder;
	}
	public static void main(String[] args){
		int[][] a = new int[][] {
			{0, 0, 0, 0},
			{1, 0, 0, 0},
			{1, 1, 0, 0},
			{1, 1, 1, 0}
		};
		int [][] finalOrder = fillEmUpMain(a);
		
		for(int i=0;i<finalOrder.length;i++){
			System.out.println(finalOrder[i][0] + " - " + finalOrder[i][1]);
		}
	}
}
