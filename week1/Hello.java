package week1;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		 	Scanner scanner = new Scanner(System.in);
		    int a = scanner.nextInt();
		    char oper = scanner.next().charAt(0);
		    int b = scanner.nextInt();
		    double c = 0.0;

		    if(oper == '+') {
		    	c = a + b;
		    }
		    
		    if(oper == '-') {
		    	c = a - b;
		    }
		    if(oper == '^') {
		    	c = 1;
		    	for(int i = 0; i<b; i=i+1){
		    		c = c * a;
		    	}
		    }
		    
		    System.out.println(c);
		    
	}
		 
}
	
