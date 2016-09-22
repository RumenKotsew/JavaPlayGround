package week1;

import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int padding = 1;
		int n = scanner.nextInt() + 1;
		int[][] Pyramid = new int [n][n + 1];
		int length = Pyramid.length;
		
		for (int row = 0; row < Pyramid.length; row++) {
			for (int col = 0; col < (row)  ; col++) {
				if (col == 0) {
					Pyramid[row][col] = 1;
				}
				if (col == row + 1){
					Pyramid[row][col] = 1;
				}
				if (col != 0 && col != row) {
					Pyramid[row][col] = Pyramid[row - 1][col - 1] + Pyramid[row - 1][col];
				}
			}
		}
		for(int i = 1; i < Pyramid.length; i++)
		   {
		      for(int j = 0; j < Pyramid.length; j++) {
		    	  if (Pyramid[i][j] != 0) {
		    		  if (j != 0) {
		    			  padding = 6;
		    		  }
		    		  if (j == 0) {
		    			  padding = length + (length - 1) * 2;
		    			  length = length - 1;
		    			  
		    		  }
		    		  System.out.printf("%" + padding + "d", Pyramid[i][j]);
		    	  }
		      }
		      System.out.println();
		   }
	}
}








