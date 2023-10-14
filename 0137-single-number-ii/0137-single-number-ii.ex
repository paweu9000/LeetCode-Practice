defmodule Solution do
  @spec single_number(nums :: [integer]) :: integer
  def single_number(nums) do
    {result, _} = Enum.frequencies(nums)
    |> Enum.find(fn {_, v} -> v == 1 end)
    result
  end
end