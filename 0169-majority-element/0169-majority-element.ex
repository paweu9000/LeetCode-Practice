defmodule Solution do
  @spec majority_element(nums :: [integer]) :: integer
  def majority_element(nums) do
    {result, _} = Enum.frequencies(nums)
    |> Enum.max_by(fn {_, z} -> z end)
    result
  end
end