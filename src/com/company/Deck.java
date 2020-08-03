package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public interface Deck {
    public List<Card> shuffle(List<Card> deck);
    public void sort();
    public void sortDescByRank();
    public void sortAscByRank();
    public List<Card> generateDeck(int size);
    public void addCard(Card card);
    public void addCards(List<Card> cards);
    public List<Card>  getDeck();
    public void printCards();
    public Map<Integer, List<Card>> deal(int players, int numberOfCards);
}
