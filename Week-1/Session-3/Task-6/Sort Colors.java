// Program
class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int current = 0;
        int right = nums.length - 1;

        while (current <= right) {
            if (nums[current] == 0) {
               
                int temp = nums[left];
                nums[left] = nums[current];
                nums[current] = temp;

                left++;
                current++;
            } 
            else if (nums[current] == 1) {
                
                current++;
            } 
            else {
                
                int temp = nums[current];
                nums[current] = nums[right];
                nums[right] = temp;
              right--;
            }
        }
    }
}
Accepted
Runtime: 0 ms
Case 1
Case 2
Input
nums = [2,0,2,1,1,0]
Output : [0,0,1,1,2,2]
Expected : [0,0,1,1,2,2]
