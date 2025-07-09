class Solution {
public:
    int maxProduct(vector<int>& nums) {
        if (nums.empty()) return 0;

        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.size(); i++) {
        // Store previous max before updating it
            int tempMax = maxProd;

            maxProd = max({nums[i], nums[i] * maxProd, nums[i] * minProd});
            minProd = min({nums[i], nums[i] * tempMax, nums[i] * minProd});

            result = max(result, maxProd);
    }

    return result;
        
    }
};