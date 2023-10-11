package fr.pantheonsorbonne.cri;

public class ThreeOfAKindCombination extends Combination {
    public ThreeOfAKindCombination(Card[] cards) {
        super(cards);
    }

    Boolean isMatch = null;
    int maxValue = 0;

    public boolean isMatch() {
        if (isMatch != null) {
            return isMatch.booleanValue();
        } else {
            int countCardSameValue = 0;
            int valueCardSameValue = 0;
            for (int i = 0; i < cards.length; i++) {
                int countCardSameValueLoop = 1;
                int valueCardSameValueLoop = 0;
                for (int j = i+1; j < cards.length; j++) {
                    if (cards[i].cardValue() == cards[j].cardValue()) {
                        countCardSameValueLoop++;
                    }
                }
                if (countCardSameValueLoop > countCardSameValue
                        || (countCardSameValueLoop == countCardSameValue
                                && valueCardSameValue < valueCardSameValueLoop)) {
                    countCardSameValue = countCardSameValueLoop;
                    valueCardSameValue = cards[i].cardValue();
                }
            }
            isMatch = countCardSameValue >= 3;
            maxValue = valueCardSameValue;
            return isMatch;
        }

    }

    public int getHighestCombinationCardRank() {
        isMatch();
        return this.maxValue;
    }
}

