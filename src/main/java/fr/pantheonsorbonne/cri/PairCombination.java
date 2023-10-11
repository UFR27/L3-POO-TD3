package fr.pantheonsorbonne.cri;

public class PairCombination extends RepeatedCombination {
    public PairCombination(Card[] cards) {
        super(cards);
    }

    @Override
    public int getRequiredNumberOfRepetition() {
        return 2;
    }

  
}
