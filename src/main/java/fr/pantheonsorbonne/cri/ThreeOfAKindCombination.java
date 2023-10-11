package fr.pantheonsorbonne.cri;

public class ThreeOfAKindCombination extends RepeatedCombination {
    public ThreeOfAKindCombination(Card[] cards) {
        super(cards);
    }

    @Override
    public int getRequiredNumberOfRepetition() {
        return 3;
    }

}
