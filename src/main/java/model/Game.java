package model;

import java.util.ArrayList;

public class Game {

    private ArrayList<Card> playingDeck;
    private ArrayList<Card> muckCards;
    private ArrayList<Card> playerCards;
    private ArrayList<Card> dealerCards;
    private final int DECK_AMOUNT = 6;

    private int dealerTotal = 0;
    private int playerTotal = 0;

    public ArrayList<Card> getPlayingDeck() {
        return playingDeck;
    }

    public void setPlayingDeck(ArrayList<Card> playingDeck) {
        this.playingDeck = playingDeck;
    }

    public ArrayList<Card> getMuckCards() {
        return muckCards;
    }

    public void setMuckCards(ArrayList<Card> muckCards) {
        this.muckCards = muckCards;
    }

    public Game() {

        playingDeck = new ArrayList<Card>();
        createPlayingDeck();

        muckCards = new ArrayList<Card>();
        playerCards = new ArrayList<Card>();
        dealerCards = new ArrayList<Card>();

        giveCardToDealer(getRandomCard());

        giveCardToPlayer(getRandomCard());
        giveCardToPlayer(getRandomCard());
    }

    public void createDeck() {
        for (Suit suit : Suit.values()) {
            for (Value value : Value.values()) {
                playingDeck.add(new Card(suit, value));
            }
        }
    }

    public void createPlayingDeck() {
        for (int i = 0; i < DECK_AMOUNT; i++) createDeck();
    }

    public void startGame() {

    }

    public Card getRandomCard() {
        int random = (int) (Math.random() * playingDeck.size());
        Card card = playingDeck.get(random);
        playingDeck.remove(random);
        return card;
    }

    public void giveCardToPlayer(Card card) {
        playerCards.add(card);
        if (card.getValue() == Value.ACE && (playerTotal + card.getRating() > 21)) {
            card.setRating(1);
        }
        playerTotal += card.getRating();
    }

    public void giveCardToDealer(Card card) {
        dealerCards.add(card);
        if (card.getValue() == Value.ACE && (dealerTotal + card.getRating() > 21)) {
            card.setRating(1);
        }
        dealerTotal += card.getRating();
    }

    public void showTable() {


        System.out.println("Dealer's cards: ");
        for (Card dealerCard : dealerCards) {
            System.out.print(" <" + dealerCard.getValue() + " " + dealerCard.getSuit() + "> ");
        }
        System.out.println();
        System.out.println("Total: " + dealerTotal);
        System.out.println();

        System.out.println("Player's cards: ");
        for (Card playerCard : playerCards) {
            System.out.print(" <" + playerCard.getValue() + " " + playerCard.getSuit() + "> ");
        }
        System.out.println();
        System.out.println("Total: " + playerTotal);
        System.out.println();
    }


}
