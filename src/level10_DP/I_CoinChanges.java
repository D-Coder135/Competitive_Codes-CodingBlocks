/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 22-01-2022/01/2022
 *   Time: 02:30 PM
 *   File: I_CoinChanges
 */

/**
 * Coding Blocks Problem =>
 * <p>
 * Given a value N, if we want to make change for N cents, and we have infinite supply of each
 * of S = { S1, S2, .. , Sm} valued coins, In how many ways can we make the change? The order of coins does not matter.
 * <p>
 * <p>
 * Sample Input
 * 10 4
 * 2 5 3 6
 * <p>
 * Sample Output
 * 5
 */

package level10_DP;

import java.util.Scanner;

public class I_CoinChanges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int size = scanner.nextInt();
        int[] coin = {2, 5, 3, 6};
        System.out.println(numberOfWays(coin, amount, 0));
    }

    private static int numberOfWays(int[] coin, int amount, int i) {
        if (amount == 0) {
            return 1;
        }

        if (i == coin.length) {
            return 0;
        }

        int inc = 0, exc = 0;

        if (amount >= coin[i]) {
            inc += numberOfWays(coin, amount - coin[i], i);
        }
        exc += numberOfWays(coin, amount, i + 1);
        return inc + exc;
    }
}
