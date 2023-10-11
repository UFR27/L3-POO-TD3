package fr.pantheonsorbonne.cri;

public class FourOfAKindCombination extends RepeatedCombination {
    public FourOfAKindCombination(Card[] cards) {
        super(cards);
    }

    @Override
    public int getRequiredNumberOfRepetition() {
        return 4;
    }

}
