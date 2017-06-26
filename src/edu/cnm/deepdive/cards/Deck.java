/**
 * 
 */
package edu.cnm.deepdive.cards;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author Yolanda Philgreen
 * The initialization of the new class deck.
 * Cards are chosen within the deck to be shuffled beforhand.
 */
public class Deck {

  private ArrayList<Card> cards;
  private boolean shuffled;
  private Random rng = null;
  private int position;
  
 /*
  *  arrays denoted for use in the deck to use in shuffle phase. 
  */
  public Deck() {
    super();
    cards = new ArrayList<>();
    for (Card.Suit suit : Card.Suit.values()){
     for (Card.Rank rank : Card.Rank.values()){
       Card card = new Card(suit,rank);
       cards.add(card);
     }
    
    }
    shuffled = false;
    position = 0;
    }
  /*
   * the secured random number generator is initialized and for use in the shuffle.
   */
  public void shuffle() 
  throws NoSuchAlgorithmException {
    if (rng == null) {
      rng = SecureRandom.getInstanceStrong();
    }
    Collections.shuffle(cards, rng);
    shuffled = true;
    position = 0;
  }
  /*  Draw and return
   *  will bring the card choice from the array of strings and the number generator.
   */
 public Card[] toArray() {
   return cards.toArray(new Card[] {});
 }
 /*
  *  Card is drawn and if not in position will be given a out of bounds exception.
  *  
  */
  public Card draw() 
  throws IndexOutOfBoundsException{
    return cards.get(position++);  
  }
  /*
   * Number of cards in deck are drawn.
   */
  public Card [] draw(int numCards)
    throws IndexOutOfBoundsException {
   Card[] hand = new Card[numCards];
  for (int i = 0; i <hand.length; i++) {
    hand[i] = draw();
  }
  return hand;
  
  }
  @Override
  public String toString() {
    return cards.toString();
    
  }
}
