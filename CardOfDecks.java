package com.OOPs;
import java.util.Random;

class ShuffleCard{

	Random rand = new Random();
	String[] cardType = { "Clubs", "Diamonds", "Hearts", "Spades" };
	String[] cardNumbers = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	String[][] cardsArray = new String[4][20];
	
	public void shuffleCard() {
		for(int i = 0;i < 4; i++) {
			for(int j =0; j < 9; j++) {
				int randindex = rand.nextInt(12);
				String temp = cardsArray[i][randindex];
				cardsArray[i][randindex] = cardsArray[i][j];
				cardsArray[i][j] = temp;
			}
		}
	}
}

public class CardOfDecks {

	public static void main(String[] args) {

		ShuffleCard obj = new ShuffleCard();
		int start = 0, end = 12;
		
		for (int i = 0; i < 4; i++) {
			
			for (int j = start; j <= end; j++) {
				obj.cardsArray[i][j] = obj.cardType[i] + " " + obj.cardNumbers[j];
			}
		}

		for (int i = 0; i < 4 ; i++) {
			for(int j=0 ; j <= 12;j++)
			System.out.println(obj.cardsArray[i][j] + " ");
		}

	    obj.shuffleCard();
		
		
		for (int i = 0; i < 4; i++) {
			System.out.print("For Player " + i + ": \n");
			for (int j = 0; j < 9; j++) {

				System.out.print(obj.cardsArray[i][j] +": ");
			}
			System.out.println();
		}

	}

}
