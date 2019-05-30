package fibonacci;

import kata.Kata;

public class Xbonacci extends Kata {

    private static final String kataLink = "https://www.codewars.com/kata/556deca17c58da83c00002db/train/javascript";

    public Xbonacci() {
        super(kataLink);
    }

    public double[] tribonacci(double[] s, int n) {

        if (n == 0) return new double[0];
        double[] nums = new double[n];

        if (n > 3) {
            for (int i = 0; i < 3; i++) {
                nums[i] = s[i];
            }
            for (int i = 3; i < n; i++) {
                nums[i] = nums[i - 3] + nums[i - 2] + nums[i - 1];
            }

        } else {
            for (int i = 0; i < n; i++) {
                nums[i] = s[i];
            }
        }

        return nums;
    }

}
