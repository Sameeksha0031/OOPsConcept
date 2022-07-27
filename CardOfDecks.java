package com.OOPs;

import java.util.Arrays;
import java.util.Random;

class ShuffleCard{

	Random rand = new Random();
	String[] cardType = { "Clubs", "Diamonds", "Hearts", "Spades" };
	String[] cardNumbers = { "201", "302", "403", "504", "605", "706", "807", "908", "1009", "Jack11", "Queen12", "King13", "Ace14" };
	String[] cardsArray = new String[53];
	
	public void shuffleCard() {
			for(int j =0; j < 9; j++) {
				int randindexOne = rand.nextInt(52);
				String temp = cardsArray[randindexOne];
				cardsArray[randindexOne] = cardsArray[j];
				cardsArray[j] = temp;
				//System.out.println(cardsArray[j]);
			}
	}
}

public class CardOfDecks {
	

	public static void main(String[] args) {
		
		ShuffleCard obj = new ShuffleCard(); 
	
		int z = 0;
		for (int i = 0; i < obj.cardType.length; i++) {
			for (int j = 0; j < obj.cardNumbers.length; j++) {
				obj.cardsArray[z] = obj.cardType[i] + " " + obj.cardNumbers[j];
				z++;
			}
		}
		
		QueueLinklist queue = new QueueLinklist();
 
		//CardOfDecks obj = new CardOfDecks();
		 
		obj.shuffleCard();
		String[] arr = new String[9];
		char[] last1 = new char[2];
		char[] last2 = new char[2];
		z = 0;
		String temp1, temp2, temp3, temp4;
		for (int k = 0; k < 4; k++) {
			for (int j = 0; j < 9; j++) {
				arr[j] = obj.cardsArray[z];
				z++;

			}
//			System.out.println();
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = 0; j < arr.length - i - 1; j++) {
					temp1 = arr[j];
					temp2 = arr[j + 1];

					last1[0] = temp1.charAt(temp1.length() - 2);
					last1[1] = temp1.charAt(temp1.length() - 1);
					last2[0] = temp2.charAt(temp2.length() - 2);
					last2[1] = temp2.charAt(temp2.length() - 1);
					if (Arrays.compare(last1, last2) > 0) {
						temp3 = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp3;

					}

				}

			}

//			System.out.println();
			queue.enQueue("For Player " + k + " : \n");
			for (int j = 0; j < 9; j++) {
				temp4 = arr[j].substring(0, arr[j].length() - 2);
				// System.out.print(temp4+"-->");
				
				queue.enQueue(temp4 + "-->");
			}
			// System.out.println();
			queue.enQueue("\n");
		}	

	}

}