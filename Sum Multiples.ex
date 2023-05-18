defmodule Solution do
    @spec sum_of_multiples(n :: integer) :: integer
    def sum_of_multiples(n) do
        Enum.reduce(1..n, 0, fn i, acc -> 
            if rem(i, 3) == 0 or rem(i, 5) == 0 or rem(i, 7) == 0 do
                i + acc
            else
                acc
            end
        end)
    end
end
