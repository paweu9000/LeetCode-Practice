class Solution {
public:
    struct Vector {
        int x;
        int y;
        
        bool operator==(const Vector& r) const {
            return x == r.x && y == r.y;
        }
    
    };
    
    struct VectorHash {
        size_t operator()(const Vector& v) const {
            return std::hash<int>()(v.x) ^ std::hash<int>()(v.y);
        }
    };
    
    bool isPathCrossing(string path) {
        std::unordered_set<Vector, VectorHash> vectors;
        Vector start = Vector{0,0};
        vectors.insert(start);
        for (auto c : path)
        {
            switch (c) {
                case 'N':
                    start.y += 1;
                    break;
                case 'E':
                    start.x -= 1;
                    break;
                case 'S':
                    start.y -= 1;
                    break;
                case 'W':
                    start.x += 1;
                    break;
            }
            if (!vectors.contains(start)) vectors.insert(start);
            else return true;
        }
        return false;
    }
};