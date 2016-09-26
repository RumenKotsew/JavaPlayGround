package week1;

public class Programming101_0 {
	public static String headsOrTails(char[] allTosses) {
		int tailsCounter = 0;
		int[] consecutiveHeadsAndTailsCounter = new int[2];
		
		for (int i = 0; i < allTosses.length; i++) {
			if (allTosses[i] == 'H') {
				for (int j = i; j < allTosses.length; j++) {
					if (allTosses[j] == 'H') {
						consecutiveHeadsAndTailsCounter[1]++;
					}
					if (allTosses[j] == 'T' || allTosses[j] == 'H' && j == allTosses.length - 1) {
						if (consecutiveHeadsAndTailsCounter[1] > consecutiveHeadsAndTailsCounter[0]) {
							consecutiveHeadsAndTailsCounter[0] = consecutiveHeadsAndTailsCounter[1];
							consecutiveHeadsAndTailsCounter[1] = 0;
						}
						consecutiveHeadsAndTailsCounter[1] = 0;
						j = allTosses.length;
					}
				}
			}
		}
		for (int i = 0; i < allTosses.length; i++) {
			if (allTosses[i] == 'T') {
				for (int j = i; j < allTosses.length; j++) {
					if (allTosses[j] == 'T') {
						tailsCounter++;
					}
					if (allTosses[j] != 'T' || allTosses[j] == 'T' && j == allTosses.length - 1) {
						if (tailsCounter > consecutiveHeadsAndTailsCounter[1]) {
							consecutiveHeadsAndTailsCounter[1] = tailsCounter;
						}
						tailsCounter = 0;
						j = allTosses.length;
					}
 				}
			}
		}
		if (consecutiveHeadsAndTailsCounter[0] > consecutiveHeadsAndTailsCounter[1]) {			
			return "H Wins!";
		}	else {
				if (consecutiveHeadsAndTailsCounter[0] < consecutiveHeadsAndTailsCounter[1]) {
					return "T Wins!";
				} else {
					return "Draw!";
				}
			}
	}
	public static void main(String[] args) {
		char[] list = new char[] {'T', 'T', 'H', 'T', 'T', 'T', 'T', 'H', 'H', 'T'};
		System.out.println(headsOrTails(list));
	}
}