defmodule Solution do
  @spec get_concatenation(nums :: [integer]) :: [integer]
  def get_concatenation(nums) do
    Enum.concat nums, nums
  end
end