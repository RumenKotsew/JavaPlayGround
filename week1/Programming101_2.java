package week1;

import java.math.BigInteger;
import java.util.Arrays;

public class Programming101_2 {
	public static char[] findDecodeKey(String inputString) {
		int counter = 1; // използвам го да отчитам колко пъти съм срещнал същия символ.
		int listCounter = 0; // служи за запълване на празната хистограма.
		char[] inputArray = inputString.toCharArray();
		Arrays.sort(inputArray);
		
		// фор цикъл за намиране броя на уникалните символи, за да знам колко да ми е голяма хистограмата.
		int forCounter = 0;
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] != inputArray[i - 1]) {
				forCounter++;
			}
		}
		char[] rarityList = new char[forCounter]; // кореспондират една с друга чрез индексите 
		int[] rarityListQuantity = new int[forCounter]; // например rarityList[5] е символа, който се повтаря rarityListQuantity[5] пъти в масива.
		
		// фор цикъл за изброяване на еднаквите поредни символи.
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[i] == inputArray[j]) {
					counter++;
					
		// при приключване на поредицата от еднакви записвам символа в rarityList и количеството в ~~
		// rarityListQuantity, след което занулирам counter и увеличавам listCounter с 1, за да стигна~~
		// до празно място в хистограмата.
				} else {
					rarityList[listCounter] = inputArray[i];
					rarityListQuantity[listCounter] = counter; // quantity corresponds to rarity with the same index
					listCounter++;
					counter = 1;
					i = j;
				}
			}
		}
		
		// сортирам quantity и rarity.
		int temp = 0;
		char tempChar = 0;
		boolean flag = true;
		while (flag) {
			flag = false;
			for (int i = 0; i < rarityListQuantity.length - 1; i++) {
				if (rarityListQuantity[i] < rarityListQuantity[i + 1]) {
					temp = rarityListQuantity[i];
					tempChar = rarityList[i];
					rarityListQuantity[i] = rarityListQuantity[i + 1];
					rarityList[i] = rarityList[i + 1];
					rarityListQuantity[i + 1] = temp;
					rarityList[i + 1] = tempChar;
					flag = true;
				}
			}
		}
		
		// изграждам финалния масив с честотата на срещане на всеки от най-срещаните символи.
		char[] decodeKey = new char[10];
		int decodeCounter = 0;
		for (int i = 9; i >= 0; i--) {
			decodeKey[i] = rarityList[decodeCounter];
			decodeCounter++;
		}
		
		//DecodeKey съдържа най-често срещаните символи, а индексите им са цифрите, с които ще заместя тези символи
		// в първоначалния масив, който input-вам.
		System.out.println(decodeKey);
		return decodeKey;
	}
	public static char[] decode(String inputString, char[] decodeKey) {
		char[] inputArray = inputString.toCharArray();
		for (int i = 0; i < decodeKey.length; i++) {
			for (int j = 0; j < inputArray.length; j++) {
				if (inputArray[j] == decodeKey[i]) {
					inputArray[j] = (char)(i + '0'); // шано трансформация от Камен.
				}
			}
		}
		return inputArray;
	}
	public static long[] createSumArray(char[] inputArray) { 
		
		long sum = 0;
		int sumCounter = 0;
		int forCounter = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (Character.isDigit(inputArray[i]) == false) {
				forCounter++;
			}
		}
		long[] sumArray = new long[forCounter - 1];
		System.out.println(forCounter + "forcounter");
		
		BigInteger afaf = new BigInteger("934245988807287881667");
		
		for (int i = 0; i < inputArray.length; i++) {
		    if (Character.isDigit(inputArray[i])) {
		    	for (int j = i; j < inputArray.length; j++) {
					if (Character.isDigit(inputArray[j])) {
		    		sum = 10*(sum) + Math.abs(Integer.parseInt(inputArray[j] + ""));
					} else {
						i = j;
						j = inputArray.length;
						sumArray[sumCounter] = sum;
						sumCounter++;
						sum = 0;
					}
				}
		    } 
		}
		
		return sumArray;
	}
	public static long sumEverything (long[] sumArray) {
		long totalSum = 0;
		for (int i = 0; i < sumArray.length; i++) {
			totalSum = totalSum + Math.abs(sumArray[i]);
		}
		return totalSum;
	}
	public static void main(String[] args) {
		String a = new String("}w#\\a:\\?uxv?xvxx@axx?\\u\\^:a~wx?x-:u\\v\\a:???^xv?x??cwwx_?uhvc:w<v,:ucwzuaw::uaucwaa^ra:;?:\\?xbw[^^:w::ca\\wcvl\\:%");
		char[] b = decode(a, findDecodeKey(a));
		System.out.println(b);
		System.out.println(Arrays.toString(createSumArray(b)));
		System.out.println(sumEverything(createSumArray(b)));
		
	}
}