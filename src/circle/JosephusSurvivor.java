package circle;

import kata.Kata;

import java.util.ArrayList;
import java.util.List;

public class JosephusSurvivor extends Kata {

    private static final String kataLink = "https://www.codewars.com/kata/555624b601231dc7a400017a/train/java";

    public JosephusSurvivor() {
        super(kataLink);
    }

    public static int josephusSurvivor(final int n, final int k) {

        List<Integer> nums = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }

        for (int i = 0; i < nums.size(); i++) {
//            System.out.print(nums.get((i % n)) + " ");
            System.out.print(nums.get(i) + " ");
        }

        return -1;
    }

}
