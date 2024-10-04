/*
 * @lc app=leetcode id=3304 lang=java
 *
 * [3304] Find the K-th Character in String Game I
 */

// @lc code=start
class Solution {
    public char kthCharacter(int k) {
        String final_string = "a";
        byte[] byte_arr = new byte[k-1];
        
         
        while(byte_arr.length < k){
            String append = "";
            for(int i = 0; i< final_string.length(); i++){
            char new_char = (char)(final_string.charAt(i) + 1);
            append += new_char;
            }
            final_string += append;
            
        }
        System.out.println(final_string);
        return final_string.charAt(k-1);
        
        return 'a';
    }
}
// @lc code=end

