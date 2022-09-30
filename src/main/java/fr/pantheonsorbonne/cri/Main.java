package fr.pantheonsorbonne.cri;

public class Main {
    public static void main(String... args) {

        {
            Card[] hand1 = new Card[]{new Card(2, 'c'), new Card(3, 'c'), new Card(4, 'c'),
                    new Card(5, 't'), new Card(5, 'k')};

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

    }
}
