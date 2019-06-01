package hackerrank.javamodules;

import java.util.Arrays;
import java.util.Scanner;

public class Array1d {

    static boolean used[];
    static int n;

    public static boolean canWin(int leap, int[] game) {
        n = game.length;
        used = new boolean[n];
        Arrays.fill(used, false);
        return isWin(leap, 0, game);
    }

    private static boolean isWin(int leap, int pos, int[] game) {

        if (used[pos]) {
            return false;
        }
        used[pos] = true;

        if (game[pos] == 0 && (pos == n - 1 || pos + leap >= n)) {
            return true;
        }

        if (valid(game, pos - 1) && isWin(leap, pos - 1, game)) {
            return true;
        }
        if (valid(game, pos + 1) && isWin(leap, pos + 1, game)) {
            return true;
        }
        if (valid(game, pos + leap) && isWin(leap, pos + leap, game)) {
            return true;
        }
        return false;
        //return  || isWin(leap, pos + 1, game) || isWin(leap, pos + leap, game);
    }

    private static boolean valid(int[] game, int i) {
        return i >= 0 && i < n && game[i] == 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }

}
