package com.company;

public class Main {

    public static void main(String[] args) {
            PlayingCard card = new PlayingCard(Card.Suit.HEARTS, Card.Rank.FIVE);
            PlayingCard card2 = new PlayingCard(Card.Suit.HEARTS, Card.Rank.SEVEN);
            PlayingCard card3 = new PlayingCard(Card.Suit.HEARTS, Card.Rank.FIVE);

            var hash = card.hashCode();
            var hash2 = card.hashCode();

            Boolean equals = card.equals(card3);

            System.out.println( card2.compareTo(card) );
    }
}
