public class App {

public static void main (String[] args) {

//instantiate deck
	Deck deck = new Deck();
	
//instantiate players
	Player player1 = new Player("Mario");
	Player player2 = new Player("Luigi");
    
//shuffles the deck 
	deck.shuffle();

//iterate 52 times calling the Draw method on the other player
	for(int i = 0; i < 52; i++) {			//52 cards in the deck
		if(i % 2 == 0) {					//P1 draws every card in the even positions
			player1.draw(deck);
		} else {							//P2 draws every card in the odd positions
			player2.draw(deck);
		}//end if
	}//end for loop
	
//Just for fun :)	
	System.out.println("*****" + '\u2660' + "****" + '\u2666' + "****" + '\u2663' + "****" + '\u2665' + "*****");
	System.out.println("*    LET'S PLAY WAR!!    *");  
	System.out.println("*****" + '\u2660' + "****" + '\u2666' + "****" + '\u2663' + "****" + '\u2665' + "*****");
	System.out.println("");
		
	player1.describe();						//printing out the player info and cards in hand
	System.out.println("\n" + "");			//I left these in for more info at print out :)
	player2.describe();

//iterate 26 times and call the flip method for each player.
	for(int i = 0; i < 26; i++) {
		Card card1 = player1.flip();
		Card card2 = player2.flip();
		if(card1.getValue() > card2.getValue()) {			//p1 has higher card = p1 + 1 point
			player1.incrementScore();
		} else if(card2.getValue() > card1.getValue()) {	//p2 has higher card = p2 + 1 point
			player2.incrementScore();
		} else {											//flipped cards are equal (tie) = no points to players
			player1.tieScore();
			player2.tieScore();
		}//end if
	}//end for loop

//Print the final score of each player
	System.out.println("\n" + "\n");						//a lot of extra code to make it look pretty :)
	System.out.println("       FINAL SCORES:");  
	System.out.println("*****" + '\u2660' + "****" + '\u2666' + "****" + '\u2663' + "****" + '\u2665' + "*****");
	if(player1.getScore() >= 10) {
		System.out.println ("*  " + player1.getName() + "'s score is: " + player1.getScore() + "  *");
	} else {
		System.out.println ("*  " + player1.getName() + "'s score is:  " + player1.getScore() + "  *");
	}
	if (player2.getScore() >= 10) {
		System.out.println ("*  " + player2.getName() + "'s score is: " + player2.getScore() + "  *");
	} else {
		System.out.println ("*  " + player2.getName() + "'s score is:  " + player2.getScore() + "  *");
	}
	System.out.println("*****" + '\u2660' + "****" + '\u2666' + "****" + '\u2663' + "****" + '\u2665' + "*****");
	System.out.println(" ");

//display the result
	if(player1.getScore() > player2.getScore()) {
		System.out.println (player1.getName() + " wins! (SUCK IT " + player2.getName().toUpperCase() + "!)");
	} else if (player1.getScore() < player2.getScore()) {
		System.out.println (player2.getName() + " wins! (Nice try, " + player1.getName() + "!)");
	} else {
		System.out.println ("It's a DRAW! Let's play again!");
	}//end if
	
	}//end main method
}//end class
