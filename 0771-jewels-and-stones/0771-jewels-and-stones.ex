defmodule Solution do
  @spec num_jewels_in_stones(jewels :: String.t, stones :: String.t) :: integer
  def num_jewels_in_stones(jewels, stones) do
    to_charlist(stones)
    |> Enum.filter(fn x -> 
                          Enum.member?(to_charlist(jewels), x) 
                          end)
    |> length()
  end
end