defmodule Solution do
      @spec is_anagram(s :: String.t, t :: String.t) :: boolean
      def is_anagram(s, t) do
        String.equivalent?(sort(s), sort(t))
      end
      
    defp sort(str) do
        String.to_charlist(str)
        |> Enum.sort()
        |> List.to_string()
    end
end