package com.company;


public class PlayingCard implements Card{
    private final Suit suit;
    private final Rank rank;

    public PlayingCard(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return String.format("%s of %s", rank.getText(), suit.getText());
    }


    @Override
    public int hashCode() {
        return rank.getValue() * suit.getValue() * 17 ;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Card) {
            if( ((Card) o).getRank() == this.getRank() &&
            ((Card) o).getSuit() == this.getSuit()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(Card o) {
        return o.hashCode() - this.hashCode();
    }
}