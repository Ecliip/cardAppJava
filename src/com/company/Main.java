package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Comparator<Card> cardComparator = (o1, o2) -> (o1.getRank().getValue() - o2.getRank().getValue()) +
                (o1.getSuit().getValue() - o2.getSuit().getValue());

        Deck deck = new StandardDeck();
        deck.generateDeck(2);
        deck.sortAscByRank();
        deck.printCards();
        PlayingCard card = new PlayingCard(Card.Suit.CLUBS, Card.Rank.NINE);

        deck.addCard(card);
    }
}
