defmodule Solution do
  @spec length_of_last_word(s :: String.t) :: integer
  def length_of_last_word(s) do
    String.trim_trailing(s) 
    |> String.split(" ") 
    |> List.last() 
    |> String.length()
  end
end