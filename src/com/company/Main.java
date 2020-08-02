package com.company;

public class Main {

    public static void main(String[] args) {
        Deck deck = new StandardDeck();
        deck.generateDeck(1);
        deck.sortDescByRank();
        deck.printCards();

//        System.out.println(cards);
    }
}
