package model;

import java.util.ArrayList;

public class Game {

    private ArrayList<Card> playingCards;
    private ArrayList<Card> muckCards;
    private final int DECK_AMOUNT = 6;

    public ArrayList<Card> getPlayingCards() {
        return playingCards;
    }

    public void setPlayingCards(ArrayList<Card> playingCards) {
        this.playingCards = playingCards;
    }

    public ArrayList<Card> getMuckCards() {
        return muckCards;
    }

    public void setMuckCards(ArrayList<Card> muckCards) {
        this.muckCards = muckCards;
    }

    public Game() {

        playingCards = new ArrayList<Card>();
        createPlayingCard();

        muckCards = new ArrayList<Card>();

    }

    public void createDeck() {
        for (Suit suit : Suit.values()) {
            for (Value value : Value.values()) {
                playingCards.add(new Card(suit, value));
            }
        }
    }

    public void createPlayingCard() {
        for (int i = 0; i < DECK_AMOUNT; i++) createDeck();
    }

    public void startGame() {

        playingCards = new ArrayList<Card>();

    }

}
