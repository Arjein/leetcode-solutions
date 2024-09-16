/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        

        StringBuilder s_rev = new StringBuilder();

        s_rev.append(s).reverse();
        System.out.println("S: "+ s + "S_rev: "+ s_rev);
        boolean comparison = s.equals(s_rev.toString());
        System.out.println("Comparison Result: "+ comparison);
        return comparison;
        
    }
}
// @lc code=end

