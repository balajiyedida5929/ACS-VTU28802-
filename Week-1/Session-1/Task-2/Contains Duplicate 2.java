// Program
import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            }

            map.put(nums[i], i);
        }

        return false;
    }
}
Accepted
Runtime: 0 ms
Case 1
Case 2
Case 3
Input
nums = [1,2,3,1]
k = 3
Output : true
Expected : true
