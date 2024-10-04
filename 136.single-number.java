/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */

import java.util.Arrays;

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i< nums.length; i+=2){
            if(i+1 >= nums.length){
                return nums[i+1];
            }
            if((nums[i] ^ nums[i+1]) == 1){
                return nums[i];
            }
        }
        return -1;
    }
} // 1 1 2 2 3 3 4 
// @lc code=end

