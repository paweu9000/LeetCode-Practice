object Solution {
    def getConcatenation(nums: Array[Int]): Array[Int] = {
        nums ++ nums.clone
    }
}