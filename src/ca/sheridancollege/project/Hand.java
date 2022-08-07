package ca.sheridancollege.project;

import java.util.ArrayList;


public class Hand {
    private ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<Card>();

    }

    public Hand(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public ArrayList<Card> getCards(){
        return cards;
    }

    public void drawACard(Card card){
        cards.add(card);
    }

    public boolean exceeded21() {
        return getValue() > 21;
    }

    public int getValue() {
        int sum = 0;


        return sum;
    }

    public int getAceCount() {
        int count = 0;
        return count;
    }

    public boolean containsAce() {


        return false;
    }

    @Override
    public String toString() {
        return String.valueOf(cards);
    }
}
