package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class StandardDeck implements Deck {
    final public List<Card> deck;
    
    public StandardDeck() {
        deck = new ArrayList<>();
    }

    @Override
    public List<Card> shuffle(List<Card> deck) {
        Collections.shuffle(deck);
        return deck;
    }

    @Override
    public void sort() {
        Collections.sort(deck);
    }

    @Override
    public void sortDescByRank() {
        Collections.sort(deck, (c1, c2) -> {
        if(c1.getRank().getValue() > c2.getRank().getValue()){
            return -1;
        }
        if(c2.getRank().getValue() > c1.getRank().getValue()){
            return 1;
        }
        return 0;
    });
    }

@Override
    public void sortAscByRank() {
        Collections.sort(deck, (c1, c2) -> {
        if(c1.getRank().getValue() > c2.getRank().getValue()){
            return 1;
        }
        if(c2.getRank().getValue() > c1.getRank().getValue()){
            return -1;
        }
        return 0;

    });
    }

    @Override
    public List<Card> generateDeck(int numbOfDecks) {
        if(numbOfDecks>= 1){
            for(int i = 0; i < numbOfDecks; i++) {
                for (Card.Suit suit : Card.Suit.values()) {
                    for( Card.Rank rank : Card.Rank.values()){
                        deck.add(new PlayingCard(suit, rank));
                    }
                }
            }
        }
        return deck;
    }

    @Override
    public void addCard(Card card) {
        var result = deck.stream().filter(c -> c.getRank().getValue() == card.getRank().getValue() &&
                c.getSuit().getValue() == card.getSuit().getValue() ).collect(Collectors.toList());
        if(result.size() != 0) {
            System.err.println("Warning: all the card should be unique");
            return;
        }
        deck.add(card);

    }

    @Override
    public void addCards(List<Card> cards) {

    }

    @Override
    public List<Card> getDeck() {
        return deck;
    }

    @Override
    public void printCards() {
        deck.stream().forEach( c -> System.out.println(c));
    }

    @Override
    public Map<Integer, List<Card>> deal(int players, int numberOfCards) {
        return null;
    }
}