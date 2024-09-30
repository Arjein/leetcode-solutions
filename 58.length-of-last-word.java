/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        for(int i = s.length()-1; i > 0; i--){
            if(s.charAt(i) != ' '){
                int k = i;
                while( k >= 0 && s.charAt(k) != ' '){
                    k--;
                }
                return  i - (k);
                
            }
        }
        if(s.length() > 0 && s.charAt(0 ) != ' '){
            return 1;
        }
        return 0;
    }
}
// @lc code=end

