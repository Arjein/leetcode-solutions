/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */
import java.util.*;
// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap();
        for(int i = 0; i< strs.length; i++){
            char[] char_arr = strs[i].toCharArray();
            Arrays.sort(char_arr);
            String str = String.valueOf(char_arr);
            if(!map.containsKey(str)){
                map.put(str, new ArrayList<String>());

            }
            map.get(str).add(strs[i]);    
        }
        
        
        return new ArrayList<>(map.values());
    }
}
// @lc code=end

