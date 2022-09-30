package fr.pantheonsorbonne.cri;

public class Card {
    final private int cardValue;
    final private char cardColor;

    public Card(int cardValue, char cardColor) {
        this.cardValue = cardValue;
        this.cardColor = cardColor;
    }

    public int getCardValue() {
        return cardValue;
    }


    public char getCardColor() {
        return cardColor;
    }


}
