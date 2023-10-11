package fr.pantheonsorbonne.cri;

public class AllDifferentCombination extends Combination {
    public AllDifferentCombination(Card[] cards) {
        super(cards);
    }

    /**
     * @return true if all cards are different
     */
    public boolean isMatch() {
        for (int i = 0; i < cards.length; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                if (cards[i].cardValue() == cards[j].cardValue()) {
                    return false;  // Found duplicate
                }
            }
        }
        return true;  // No duplicates found
    }
    

    /**
     * @return the highest rank in the hand
     */
    public int highestRank() {
        int highestRank=0;
        for(Card card : cards){
            if(card.cardValue()>highestRank){
                highestRank=card.cardValue();
            }
        }
        return highestRank;
    }
}
