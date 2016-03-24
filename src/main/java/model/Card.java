package model;

public class Card {

    private Suit suit;
    private Value value;
    private int rating;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
        switch (value) {
            case TWO:
                rating = 2;
                break;
            case THREE:
                rating = 3;
                break;
            case FOUR:
                rating = 4;
                break;
            case FIVE:
                rating = 5;
                break;
            case SIX:
                rating = 6;
                break;
            case SEVEN:
                rating = 7;
                break;
            case EIGHT:
                rating = 8;
                break;
            case NINE:
                rating = 9;
                break;
            case TEN:
                rating = 10;
                break;
            case JACK:
                rating = 10;
                break;
            case QUEEN:
                rating = 10;
                break;
            case KING:
                rating = 10;
                break;
            case ACE:
                rating = 11;
                break;
        }
    }

    public Suit getSuit() {

        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
