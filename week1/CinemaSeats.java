package week1;

public class CinemaSeats {
	public static int[][] fillEmUpMain(int[][] cinema ) {
		int a = cinema.length * cinema[0].length;
		int[][] order = new int[a][2];
		int orderRow = 0;
		int[] arrangement = new int[order.length];
		for (int i = 0; i < cinema.length; i++) {
			for (int j = 0; j < cinema.length; j++) {
				if (cinema[i][j] == 0) {
					order[orderRow][0] = i + 1;
					order[orderRow][1] = j + 1;
					cinema [i][j] = 1;
					orderRow = orderRow + 1;
				}
			}
		}
//		for (int i = 0; i < order.length - 1; i++) {
//			while (order[i][0] == order[i + 1][0]) {
//				arrangement[i] = arrangement[i] + 1;
//			}
//			System.out.println("for" +  i + " " + arrangement[i]);
//		}
		return order;
	}
	public static void main(String[] args){
		int[][] a = new int[][] {
			{1, 1, 0, 0},
			{1, 0, 1, 0},
			{0, 0, 0, 0},
			{1, 1, 1, 0}
		};
		int [][] finalOrder = fillEmUpMain(a);
		
		for(int i=0;i<finalOrder.length;i++){
			System.out.println(finalOrder[i][0] + " - " + finalOrder[i][1]);
		}
	}
}
