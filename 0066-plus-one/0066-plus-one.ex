defmodule Solution do
  @spec plus_one(digits :: [integer]) :: [integer]
  def plus_one(digits) do
        Enum.join(digits, "")
        |> String.to_integer()
        |> inc()
        |> Integer.to_string()
        |> String.graphemes()
        |> Enum.map(fn x -> String.to_integer(x) end)
  end
      
    defp inc(n), do: n+1
end