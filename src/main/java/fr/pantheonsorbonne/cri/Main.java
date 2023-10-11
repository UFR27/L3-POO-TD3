package fr.pantheonsorbonne.cri;

public class Main {
    public static void main(String... args) {

        {
            Card[] hand1 = new Card[]{
                new Card(2, 'c'),
                new Card(3, 'c'),
                new Card(4, 'c'),
                new Card(5, 't'),
                new Card(5, 'k')};

            Combination alldiff = new AllDifferentCombination(hand1);
            System.out.println("t1-" + (alldiff.isMatch() ? "KO" : "OK"));
        }

        {
            Card[] hand1 = new Card[]{new Card(2, 'c'), new Card(3, 'c'), new Card(4, 'c'),
                    new Card(5, 't'), new Card(6, 'k')};

            Combination alldiff = new AllDifferentCombination(hand1);
            System.out.println("t2-" + (alldiff.isMatch() ? "OK" : "KO"));
        }

        {
            Card[] hand1 = new Card[]{new Card(2, 'c'), new Card(3, 'c'), new Card(4, 'c'),
                    new Card(5, 't'), new Card(5, 'k')};

            PairCombination alldiff = new PairCombination(hand1);
            System.out.println("t3-" + (alldiff.isMatch() ? "OK" : "KO"));
            System.out.println("t4-" + (alldiff.getHighestCombinationCardRank() == 5 ? "OK" : "KO"));
        }

          {
            Card[] hand1 = new Card[]{new Card(2, 'h'),
                                      new Card(5, 's'),
                                      new Card(4, 'd'),
                                      new Card(5, 'c'),
                                      new Card(5, 'h')};

            ThreeOfAKindCombination alldiff = new ThreeOfAKindCombination(hand1);
            System.out.println("t5-" + (alldiff.isMatch() ? "OK" : "KO"));
            System.out.println("t6-" + (alldiff.getHighestCombinationCardRank() == 5 ? "OK" : "KO"));
        }

          {
             Card[] hand1 = new Card[]{new Card(2, 'h'),
                                      new Card(5, 's'),
                                      new Card(5, 'd'),
                                      new Card(5, 'c'),
                                      new Card(5, 'h')};

            FourOfAKindCombination alldiff = new FourOfAKindCombination(hand1);
            System.out.println("t7-" + (alldiff.isMatch() ? "OK" : "KO"));
            System.out.println("t8-" + (alldiff.getHighestCombinationCardRank() == 5 ? "OK" : "KO"));
        }

    }
}
