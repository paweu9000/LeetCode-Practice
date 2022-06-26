public class Solution {
    public int MaximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i=0; i<accounts.Length; i++){
            int money = 0;
            for (int j=0; j<accounts[i].Length; j++){
                money += accounts[i][j];
            }
            if (money >= maxWealth){
                maxWealth = money;
            }
        }
        return maxWealth;
    }
}