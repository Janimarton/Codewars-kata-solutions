package matrix;

public class Addiction {

    private final String kataLink = "https://www.codewars.com/kata/matrix-addition/train/java";

    public static int[][] matrixAddition(int[][] a, int[][] b) {

        int[][] result = new int[a.length][a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                result[i][j] += a[i][j] + b[i][j];

            }
        }

        return result;
    }

}