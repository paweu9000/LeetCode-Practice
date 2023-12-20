class Solution {

    /**
     * @param Integer[] $prices
     * @param Integer $money
     * @return Integer
     */
    function buyChoco($prices, $money) {
        sort($prices);
        $result = $money - ($prices[0] + $prices[1]);
        return $result >= 0 ? $result : $money;
    }
}