import java.util.Arrays;

public class Arraysquestion12 {
    // 1561. Maximum Number of Coins You Can Get---leetcode
    public static void main(String[] args) {
        int[] piles = {9,8,7,6,5,1,2,3,4};
        System.out.println(maxCoins(piles));
    }
    public static int maxCoins(int[] piles) {
        // sort the array piles reason : [minforbob,minforbob,.....,lastmaxforme,moaxforalice].
        Arrays.sort(piles);
        int coins = 0;   //initially i have 0 coins
        int j = piles.length - 2;   // as last index have maxcoins which is for alice so j-2 the second last element for me.
        // to add all coins lets make iteration till n = piles.length/3 which is n no. of piles i can have in piles[].
        for (int i = 0; i < piles.length/3; i++) {
            coins = coins + piles[j];
            j = j - 2; // in j-2 index will have my max coins which is after alice max coins.
        }
        return coins;
    }


}
