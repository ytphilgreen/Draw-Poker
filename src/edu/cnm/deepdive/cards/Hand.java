/**
 * 
 */
package edu.cnm.deepdive.cards;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Yolanda Philgreen
 * The class of Hand is initialized in the deck.
 */
public class Hand implements Comparable<Hand> {

  private final Deck deck;
  private final int size;
  private final ArrayList<Card> cards;
  /*
   *  to outline the deck size within the array of cards.
   */
  public Hand(Deck deck, int size) {
    this.deck = deck;
    this.size = size;
    cards = new ArrayList<>(Arrays.asList(deck.draw(size)));
  }
/*
 * (non-Javadoc)
 * @see java.lang.Comparable#compareTo(java.lang.Object)
 */
  @Override
  public int compareTo(Hand arg0) {
    // TODO Auto-generated method stub
    return 0;
  }
  
}

