# Definition for a binary tree node.
#
# defmodule TreeNode do
#   @type t :: %__MODULE__{
#           val: integer,
#           left: TreeNode.t() | nil,
#           right: TreeNode.t() | nil
#         }
#   defstruct val: 0, left: nil, right: nil
# end

defmodule Solution do
    @spec sorted_array_to_bst(nums :: [integer]) :: TreeNode.t | nil
	def sorted_array_to_bst([]), do: nil
	def sorted_array_to_bst(nums) do
		count = Enum.count(nums)
		{l, r} = Enum.split(nums, div(count, 2))
		[root | r] = r
		%TreeNode{val: root, left: sorted_array_to_bst(l), right: sorted_array_to_bst(r)}
	end
end