/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String shortestOne(String[] strs){
        String shortest = strs[0];
        for(String s :strs){
            if (s.length() < shortest.length()){
                shortest = s;
            }
        }
        return shortest;

    }
    public String longestCommonPrefix(String[] strs) {
        String init = shortestOne(strs);
        int ccounter = 0;
        int ct = 0;
        boolean interrupt = false;
        if(strs.length < 2){
            return init;
        }
        for(int i = 0; i < init.length(); i++){
            ccounter = 0;
            for(int j = 0; j< strs.length; j++){
                
                if(init.charAt(i) == strs[j].charAt(i)){
                    System.out.println("Counter articak---------------");
                    System.out.println("init: "+ init + " | s: " + strs[j]);
                    System.out.println("initChat: "+ init.charAt(i) + " | sCharAt: " + strs[j].charAt(i));
                    ccounter++;
                
            }            
            else{
                interrupt = true;
            }
            }
            if(interrupt){ break;}
            if(ccounter > 0  && ccounter % strs.length == 0){
                ct++;
            }
        }
        System.out.println("Ccounter: " + ccounter);
        System.out.println("Ct: " + ct);
        return init.substring(0, ct );

    }
}
// @lc code=end

