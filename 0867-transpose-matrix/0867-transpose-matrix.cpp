class Solution {
public:
    vector<vector<int>> transpose(vector<vector<int>>& matrix) {
        std::vector<std::vector<int>> result(matrix[0].size(), std::vector<int>(matrix.size(), 0));
        for (int i = 0; i < matrix.size(); i++)
        {
            for (int j = 0; j < matrix[i].size(); j++)
            {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
};