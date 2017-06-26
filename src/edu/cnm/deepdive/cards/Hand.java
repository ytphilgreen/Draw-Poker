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
    return 0;
  }
  public Card[] [] byRanks() {
    Card[] [] table = new Card[Card.Rank.values().length][];
    for (Card.Rank rank : Card.Rank.values()) {
      ArrayList<Card> members = new ArrayList<>();
      for (Card card : cards) {
        if (card.rank == rank) {
          members.add(card);
        }
        
      }
      members.sort(null);
      table[rank.ordinal()] = members.toArray(new Card[] {});
    } 
    return table;
  }
  
  public Card[] [] bySuits() {
    Card[] [] table = new Card[Card.Suit.values().length][];
    for (Card.Suit suit : Card.Suit.values()) {
      ArrayList<Card> members = new ArrayList<>();
      for (Card card : cards) {
        if (card.suit == suit) {
          members.add(card);
        }
        
      }
      members.sort(null);
      table[suit.ordinal()] = members.toArray(new Card[] {});
    }
    return table;
  }
  /*
   * gives the flush discrimination from either 0 or one off of card suits.
   */
  private boolean flush(Card[][] table) {
    for (Card[] suitedCards : table) {
      if (suitedCards.length > 0 && suitedCards.length < size) {
        return false;
      }
      if (suitedCards.length == size) {
        return true;
      }
    }
    return false;
  }
  
  
  @Override
  public String toString() {
    return cards.toString();  
}
  private ArrayList<Card.Rank> sets(Card[] [] table, int size) {
    ArrayList<Card.Rank> result = new ArrayList<>();
    for (Card.Rank rank : Card.Rank.values()) {
      if (table[rank.ordinal()].length == size) {
        
      }
    }
    return result;
  }
  private Card.Rank
}

