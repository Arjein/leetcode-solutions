/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        int totalSum = 0;
        for(int i = s.length()-1; i >= 0 ; i--){
            if(s.charAt(i) == 'I'){
                totalSum++;
            }
            if(s.charAt(i) == 'V'){
                if(i-1 >= 0 && s.charAt(i-1) == 'I'){
                    totalSum += 4;
                    i--;
                }
                else{
                    totalSum += 5;
                }
            }
            if(s.charAt(i) == 'X'){
                
                if(i-1 >= 0 && s.charAt(i-1) == 'I'){
                    totalSum += 9;
                    i--;
                }
                else{
                    totalSum += 10;
                }
            }
            if(s.charAt(i) == 'L'){
                if(i-1 >= 0 && s.charAt(i-1) == 'X'){
                    totalSum += 40;
                    i--;
                }
                else{
                    totalSum += 50;
                }
            }
            if(s.charAt(i) == 'C'){
                if(i-1 >= 0 && s.charAt(i-1) == 'X'){
                    totalSum += 90;
                    i--;
                }
                else{
                    totalSum += 100;
                }
            }
            if(s.charAt(i) == 'D'){
                if(i-1 >= 0 && s.charAt(i-1) == 'C'){
                    totalSum += 400;
                    i--;
                }
                else{
                    totalSum += 500;
                }
            }
            if(s.charAt(i) == 'M'){
                if(i-1 >= 0 && s.charAt(i-1) == 'C'){
                    totalSum += 900;
                    i--;
                }
                else{
                    totalSum += 1000;
                }
            }
        }
        return totalSum;
        
    }
}
// @lc code=end

