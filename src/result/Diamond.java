package result;

import kata.Kata;

class Diamond extends Kata {

    private static final String kataLink = "https://www.codewars.com/kata/5503013e34137eeeaa001648/train/java";

    public Diamond() {
        super(kataLink);
    }

    public static String print(int n) {
        String result = "";
        n -= n - 1;
        int i, j, space = 1;

        if (n < 2) {
            return null;
        }

        space = n - 1;
        for (j = 1; j <= n; j++) {
            for (i = 1; i <= space; i++) {
                result += " ";
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) {
                result += "*";
            }
            result += "\n";
        }
        space = 1;
        for (j = 1; j <= n - 1; j++) {
            for (i = 1; i <= space; i++) {
                result += " ";
            }
            space++;
            for (i = 1; i <= 2 * (n - j) - 1; i++) {
                result += "*";
            }
            result += "\n";
        }
        System.out.println(result);
        return result;
    }
}