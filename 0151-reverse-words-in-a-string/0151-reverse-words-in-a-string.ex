defmodule Solution do
  @spec reverse_words(s :: String.t) :: String.t
  def reverse_words(s) do
    String.split(s, " ")
    |> Enum.reverse()
    |> Enum.filter(fn x -> x != "" end)
    |> Enum.intersperse(" ")
    |> Enum.to_list()
    |> List.to_string()
  end
end