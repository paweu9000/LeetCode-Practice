defmodule Solution do
  @spec is_isomorphic(s :: String.t, t :: String.t) :: boolean
  def is_isomorphic(s, t) do
    ss = to_charlist(s)
    tt = to_charlist(t)
    
    char_map =
        ss
        |> Enum.zip(tt)
        |> Enum.reduce(%{}, fn {sc, tc}, acc -> Map.put_new(acc, sc, tc) end)
        |> Map.new(fn {key, val} -> {val, key} end)
    
    tt
    |> Enum.map(&Map.get(char_map, &1))
    |> then(&(&1 == ss))
  end
  
end