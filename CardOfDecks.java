package com.OOPs;


import java.util.Random;

class ShuffleCard{

	Random rand = new Random();
	String[] cardType = { "Clubs", "Diamonds", "Hearts", "Spades" };
	String[] cardNumbers = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	String[][] cardsArray = new String[4][13];
	
	public void shuffleCard() {
		for(int i = 0; i < 4 ; i++ )
			for(int j =0; j < 9; j++) {
				int randindexOne = rand.nextInt(4);
				int randindexTwo = rand.nextInt(12);
				String temp = cardsArray[randindexOne][randindexTwo];
				cardsArray[randindexOne][randindexTwo] = cardsArray[i][j];
				cardsArray[i][j] = temp;
			}
	}
}

public class CardOfDecks {
	

	public static void main(String[] args) {
		
		ShuffleCard obj = new ShuffleCard(); 
	
		for (int i = 0; i < obj.cardType.length; i++) {
			for (int j = 0; j < obj.cardNumbers.length; j++) {
				obj.cardsArray[i][j] = obj.cardType[i] + " " + obj.cardNumbers[j];
			}
		}
       
		obj.shuffleCard();
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Player :" + i);
			System.out.println(" ");
			for (int j = 0; j < 9; j++) {
				System.out.println(obj.cardsArray[i][j] +"\n");
			}
			System.out.println(" ");
		}
       

			


	}

}