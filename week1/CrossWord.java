package week1;

import java.util.Scanner;

public class CrossWord {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		char [][] grid = {
				{ 'i', 'a', 'r', 'v', 'i', 'a', 'n', 'i' },
				{ 'r', 'v', 'a', 'n', 'v', 'j', 'a', 'v' },
				{ 'b', 'z', 'a', 'l', 'a', 'f', 'a', 'g' },
				{ 'b', 'i', 'k', 'n', 'n', 'a', 'f', 'n' },
				{ 'u', 'm', 'j', 'a', 't', 'x', 'a', 'p' },
				{ 'd', 'v', 'r', 'v', 'a', 'v', 'i', 'q' },
				{ 'n', 'q', 'j', 'i', 'i', 's', 'q', 's' },
		};
		for (int rowIndex = 0; rowIndex < grid.length; rowIndex++) {
			for (int colIndex = 0; colIndex < grid[rowIndex].length; colIndex++ ) {
				if (rowIndex < grid.length - 3 && colIndex < grid[rowIndex].length - 3 && grid[rowIndex][colIndex] == 'i' && grid[rowIndex + 1][colIndex + 1] == 'v'
						&& grid[rowIndex + 2][colIndex + 2] == 'a' && grid[rowIndex + 3][colIndex + 3] == 'n') {
					System.out.println(" ivan nadolu/nadqsno ");
				}
				if (rowIndex < grid.length - 3 && grid[rowIndex][colIndex] == 'i' && grid[rowIndex + 1][colIndex] == 'v'
						&& grid[rowIndex + 2][colIndex] == 'a' && grid[rowIndex + 3][colIndex] == 'n') {
					System.out.println("ivan nadolu");
				}
				if (rowIndex < grid.length - 3 && colIndex > 3 && grid[rowIndex][colIndex] == 'i' && grid[rowIndex + 1][colIndex - 1] == 'v'
						&& grid[rowIndex + 2][colIndex - 2] == 'a' && grid[rowIndex + 3][colIndex - 3] == 'n') {
					System.out.println("ivan nadolu/nalqvo");
				}
				if (colIndex > 3 && grid[rowIndex][colIndex] == 'i' && grid[rowIndex][colIndex - 1] == 'v'
						&& grid[rowIndex][colIndex - 2] == 'a' && grid[rowIndex][colIndex - 3] == 'n') {
					System.out.println("ivan nalqvo");
				}
				if (colIndex > 3 && rowIndex > 3 && grid[rowIndex][colIndex] == 'i' && grid[rowIndex - 1][colIndex - 1] == 'v'
						&& grid[rowIndex - 2][colIndex - 2] == 'a' && grid[rowIndex - 3][colIndex - 3] == 'n') {
					System.out.println("ivan nagore/nalqvo");
				}
				if (rowIndex > 3 && grid[rowIndex][colIndex] == 'i' && grid[rowIndex - 1][colIndex] == 'v'
						&& grid[rowIndex - 2][colIndex] == 'a' && grid[rowIndex - 3][colIndex] == 'n') {
					System.out.println("ivan nagore");
				}
				if (colIndex < grid[rowIndex].length - 3 && rowIndex > 3 && grid[rowIndex][colIndex] == 'i' && grid[rowIndex - 1][colIndex + 1] == 'v'
						&& grid[rowIndex - 2][colIndex + 2] == 'a' && grid[rowIndex - 3][colIndex + 3] == 'n') {
					System.out.println("ivan nagore/nadqsno");
				}
				if (colIndex < grid[rowIndex].length - 3 && grid[rowIndex][colIndex] == 'i' && grid[rowIndex][colIndex + 1] == 'v'
						&& grid[rowIndex][colIndex + 2] == 'a' && grid[rowIndex][colIndex + 3] == 'n') {
					System.out.println("ivan nadqsno");
				}
			}
		}
	}
}
