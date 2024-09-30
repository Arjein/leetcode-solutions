/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == val){
                nums[i] = nums[k-1];
                nums[k-1] = -1;
                k--;
                i--;
            }
        }

        return k;
    }
}
// @lc code=end

