//package com.company;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Deck {
//    private final List<PlayingCard> deck;
//
//    {
//        deck = new ArrayList<>();
//    }
//
//    public List<PlayingCard> generateDeck() {
//        for(Rank rank : Rank.values()) {
//            for(Suit suit : Suit.values()) {
//                PlayingCard aPlayingCard = new PlayingCard(rank, suit);
//                deck.add(aPlayingCard);
//            }
//        }
//        return deck;
//    }
//
//    public void addCardIntoDeck(PlayingCard playingCard) {
//        deck.add(playingCard);
//    }
//
//    public List<PlayingCard> getDeck() {
//        return deck;
//    }
//}
