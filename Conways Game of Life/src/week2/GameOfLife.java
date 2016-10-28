package week2;

public class GameOfLife {
	public static char[][] cycle(char[][] map) {
		
//		while (true) {
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					int adjacentNeighborsCount = scan(i, j, map);
					if (map[i][j] == '■') {
						if (adjacentNeighborsCount < 2) {
							map[i][j] = '□';
						}
						if(adjacentNeighborsCount == 2 || adjacentNeighborsCount == 3) {
							map[i][j] = '■';
						}
						if (adjacentNeighborsCount > 3) {
							map[i][j] = '□';
						}
					}
					if (map[i][j] == '□') {
						if (adjacentNeighborsCount == 3) {
							map[i][j] = '■';
						}
					}
				}
//			}
		}
		return map;
	}
	
	public static int scan(int x,int y, char[][] arr) {
		int adjacentNeighborsCount = 0;
		int tempX = x;
		int tempY = y;
		
		int[][] neighbors = new int[][] {
			{-1, -1},
			{-1, 0},
			{-1, 1},
			{0, -1},
			{0, 1},
			{1, -1},
			{1, 0},
			{1, 1}
		};
		if (x == 0 && y == 0) {
			for (int i = 3; i < neighbors.length; i++) {
				if (i == 0 || i == 3 || i == 5) {
					continue;
				}
				tempX = x + neighbors[i][0];
				tempY = y + neighbors[i][1];
				if (arr[tempX][tempY] == '■') {
					adjacentNeighborsCount++;
				}
				tempX = x;
				tempY = y;
			}
		}
		if (x == 0 && y == arr[x].length) {
			for (int i = 3; i < neighbors.length; i++) {
				if (i == 2 || i == 4 || i == 7) {
					continue;
				}
				tempX = x + neighbors[i][0];
				tempY = y + neighbors[i][1];
				if (arr[tempX][tempY] == '■') {
					adjacentNeighborsCount++;
				}
				tempX = x;
				tempY = y;
			}
		}
		
		if (x == 0) {
			for (int i = 3; i < neighbors.length; i++) {
				tempX = x + neighbors[i][0];
				tempY = y + neighbors[i][1];
				if (arr[tempX][tempY] == '■') {
					adjacentNeighborsCount++;
				}
				tempX = x;
				tempY = y;
			}
		}
		if (y == 0) { 
			for (int i = 0; i < neighbors.length; i++) {
				if (i == 0 || i == 3 || i == 5) {
					continue;
				}
					tempX = x + neighbors[i][0];
					tempY = y + neighbors[i][1];
					if (arr[tempX][tempY] == '■') {
						adjacentNeighborsCount++;
					}
					tempX = x;
					tempY = y;
			}
		}
		if (x == arr.length && y == 0) {
			for (int i = 0; i < 5; i++) {
				if (i == 0 || i == 3 || i == 5) {
					continue;
				}
				tempX = x + neighbors[i][0];
				tempY = y + neighbors[i][1];
				if (arr[tempX][tempY] == '■') {
					adjacentNeighborsCount++;
				}
				tempX = x;
				tempY = y;
			}
		}
		
		if (x == arr.length) {
			for (int i = 0; i < 5; i++) {
				tempX = x + neighbors[i][0];
				tempY = y + neighbors[i][1];
				if (arr[tempX][tempY] == '■') {
					adjacentNeighborsCount++;
				}
				tempX = x;
				tempY = y;
			}
		}
		if (y == arr[x].length) {
			for (int i = 0; i < neighbors.length; i++) {
				if (i == 2 || i == 4 || i == 7) {
					continue;
				}
				tempX = x + neighbors[i][0];
				tempY = y + neighbors[i][1];
				if (arr[tempX][tempY] == '■') {
					adjacentNeighborsCount++;
				}
				tempX = x;
				tempY = y;
			}
		}
		
		if (x == arr.length && y == arr[x].length) {
			for (int i = 0; i < 5; i++) {
				if (i == 2 || i == 4 || i == 7) {
					continue;
				}
				tempX = x + neighbors[i][0];
				tempY = y + neighbors[i][1];
				if (arr[tempX][tempY] == '■') {
					adjacentNeighborsCount++;
				}
				tempX = x;
				tempY = y;
			}
		}
		
		
		
		
		for (int i = 0; i < neighbors.length; i++) {
			tempX = x + neighbors[i][0];
			tempY = y + neighbors[i][1];
			if (arr[tempX][tempY] == '■') {
				adjacentNeighborsCount++;
			}
			tempX = x;
			tempY = y;
		}
		return adjacentNeighborsCount;
	}
	
	public static void main(String[] args) {
		char[][] inputArray = new char[][] {
			{'□', '□', '□', '□', '□', '□', '□', '□', '□'},
			{'□', '■', '□', '□', '□', '□', '□', '□', '□'},
			{'□', '■', '□', '□', '□', '□', '□', '□', '□'},
			{'□', '■', '□', '□', '□', '□', '□', '□', '□'},
			{'□', '□', '□', '□', '□', '□', '□', '□', '□'},
			{'□', '□', '□', '□', '□', '□', '□', '□', '□'},
			{'□', '□', '□', '□', '□', '□', '□', '□', '□'},
			{'□', '□', '□', '□', '□', '□', '□', '□', '□'},
			{'□', '□', '□', '□', '□', '□', '□', '□', '□'},
		};
		
		char[][] a = cycle(inputArray);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
//		■ □
	}
}








