import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

//fields
	List<Card> cards = new ArrayList<Card>();

//constructor information for cards in deck
	public Deck() {					//spaces before single numbers (below) for aesthetics at final game printout
	String cardRank[] = {" 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", "10", "J", "Q", "K", "A"};
	String cardSuit[] = {"\u2663", "\u2666", "\u2665", "\u2660"};
	
//creating the cards	
	cards = new ArrayList<>();
		for(int i = 0; i < 4; i++) { 						//for 4 suits in a deck
			for(int j = 0; j < 13; j++){					//for ranks (0+12 slots in the rank array)
				String name = cardRank[j] + cardSuit[i];	//puts together the suit with the rank
				Card newCard = new Card(j + 2, name);		//starting with j + 2 because lowest card value = 2 
				cards.add(newCard);						 	//adds the newly created card to ArrayList CARDS
			} //end j for loop
		}//end i for loop
		
	}// end constructor
	
//methods	
	//shuffle cards		
	public void shuffle() {
		Collections.shuffle(cards);							//THANK YOU Rachael for this short cut! :)
	}//end shuffle
	
	//draw - removes and returns the top card of the Cards field
	public Card draw() {
		Card topCard = cards.get(cards.size() - 1);			//And this one too!
		cards.remove(topCard);
		return topCard;
	}//end draw
	
}//end class


