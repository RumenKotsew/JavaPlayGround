package week1;

public class CinemaSeats2 {
	public static int[][] fillCinema(int[][] cinema) {
		int counter = 0;
		int counter2 = 0;
		int row = 0;
		for (int i = 0; i < cinema.length; i++) {
			for (int j = 0; j < cinema.length; j++) {
				if (cinema[i][j] == 0) {
					counter++;
				}
			}
		}
		int[][] cinemaFillOrder = new int[counter][2];
		
		for (int i = 0; i < cinema.length; i++) {
			row = findFullestRow(cinema);
			int[][] tempArray = fillRow(row, cinema);
			for (int j = 0; j < tempArray.length; j++) {
				cinemaFillOrder[counter2][0] = tempArray[j][0];
				cinemaFillOrder[counter2][1] = tempArray[j][1];
				counter2++;
			}
		}	
		
		return cinemaFillOrder;
	}
	public static int findFullestRow (int[][] cinema) {
		int counter = 0;
		int highest = 0;
		int index = 0;
		for (int i = 0; i < cinema.length; i++) {
			for (int j = 0; j < cinema.length; j++) {
				if (cinema[i][j] == 1) {
					counter++;
				}
			}
			if (counter == cinema[i].length) {
				counter = 0;
			}
			if (counter > highest) {
				highest = counter;
				index = i;
			}
			counter = 0;
		}
		return index;
	}
	public static int[][] fillRow (int row, int[][] cinema) {
		int counter = 0;
		int fillIndex = 0;
		for (int i = 0; i < cinema.length; i++) {			
			if (cinema[row][i] == 0) {
				counter++;
			}
		}
		int[][] rowFillOrder = new int[counter][2];
		for (int i = 0; i < cinema.length; i++) {
			if (cinema[row][i] == 0) {
				cinema[row][i] = 1;
				rowFillOrder [fillIndex][0] = row;
				rowFillOrder[fillIndex][1] =i ;
				fillIndex++;
			}
		}
		return rowFillOrder;
	}
	public static void main(String[] args) {
		int[][] a = new int[][] {
			{1, 1, 1, 1},
			{1, 1, 0, 1},
			{1, 0, 0, 1},
			{1, 1, 0, 1}
		};
		int[][] z = fillCinema(a);
		for (int i = 0; i < z.length; i++) {
			System.out.println((z[i][0] + 1) + "-" + (z[i][1] + 1));			
		}
	}
}
