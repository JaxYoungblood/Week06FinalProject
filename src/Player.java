
import java.util.ArrayList;

public class Player {

//fields
	private ArrayList<Card> hand;
	private int score;
	private String name;

//constructor
	public Player(String name) {
		this.name = name;
		hand = new ArrayList<>();
		score = 0;
	}//end constructor

//getters and setters
	public String getName() {
	return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
	return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

//methods
	//print player info (name + cards in hand)
	public void describe () {
		System.out.println("Player Name: " + name);
		System.out.println("Cards in Hand:");
		for (Card card : hand) {
			card.describe();
		}//end for loop
	}//end describe method

	
//removes and returns top card of the hand
	public Card flip() {
		return hand.remove(0);			//removes first card (position 0) in the hand
	}//end flip method

	
//draw from deck and add returned card to the hand
	public void draw(Deck deck) {
	Card drawnCard = deck.draw();			//uses the DRAW method on the deck
	hand.add(drawnCard);					//puts the card into ArrayList HAND
	}//end method

	
//adds 1 point to the player’s score 
	public void incrementScore() {
	score = score + 1;
	}//end method
	
//adds NO point to the player’s score (in the case of a tie)
	public void tieScore() {
	score = score + 0;
	}//end method
		
	
}//end class
