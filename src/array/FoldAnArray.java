package array;

import kata.Kata;
import org.jetbrains.annotations.NotNull;

public class FoldAnArray extends Kata {

    private static final String kataLink = "https://www.codewars.com/kata/57ea70aa5500adfe8a000110";

    public FoldAnArray() {
        super(kataLink);
    }

    public static int[] foldArray(@NotNull int[] input, int runs) {

        int starterIdx = 0;
        int endingIdx = input.length - 1;
        int actualSum;
        int[] newInts;
        int newIntPosition = 0;
        if (input.length % 2 != 0) {
            newInts = new int[(input.length + 1) / 2];
        } else {
            newInts = new int[input.length / 2];
        }

        while (starterIdx < endingIdx) {
            actualSum = input[starterIdx++] + input[endingIdx--];
            newInts[newIntPosition++] = actualSum;
        }
        try {
            newInts[newIntPosition] = input[endingIdx];
        } catch (IndexOutOfBoundsException e) {
            System.out.println(runs + " run was back and an index out of bound exception occurred in the newInts int the " +
                    newIntPosition + ". position");
        }

        if (--runs > 0) {
            return foldArray(newInts, runs);

        }

        return newInts;
    }

}
