/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int low_bound = 0;
        int high_bound = nums.length;
        int med = (low_bound + high_bound) / 2;

        while(true){
            if(nums[med] == target){
                return med;
            }
            
            
            if( target > nums[med]){
                
                if( nums.length <= med+1 || nums[med+1] > target){
                    return med+1;
                }
                low_bound = med;
                
            }
            else if( target < nums[med]){
                if(med-1 < 0 || nums[med-1] < target){
                    return med;
                }
                high_bound = med;
            }
            med = (low_bound + high_bound) /2;
        }
    }
}
// @lc code=end

