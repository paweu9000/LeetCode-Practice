class Solution {

    /**
     * @param Integer $x
     * @return Boolean
     */
    function isPalindrome($x) {
        $s = strval($x);
        for ($i = 0; $i < strlen($s)/2; $i++) {
            if ($s[$i] != $s[strlen($s)-1-$i]) return false;
        }
        return true;
    }
}