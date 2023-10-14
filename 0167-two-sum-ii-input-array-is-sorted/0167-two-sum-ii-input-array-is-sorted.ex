defmodule Solution do
  @spec two_sum(numbers :: [integer], target :: integer) :: [integer]
  def two_sum(numbers, target) do
    numbers
    |> Enum.with_index(1)
    |> Enum.reduce_while(%{}, fn {num, idx}, acc ->
                  diff = target - num
                  if Map.has_key?(acc, diff) do
                    {:halt, [Map.get(acc, diff), idx]}
                  else
                    {:cont, Map.put(acc, num, idx)}
                  end
            end)
  end
end