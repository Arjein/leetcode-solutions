/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start


import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<Character>();
        int pct = 0;
        int pct2 = 0;
        int pct3 = 0;

        int pcct = 0;
        int pcct2 = 0;
        int pcct3 = 0;
        
        
        for(int i = 0; i< s.length(); i++){
            
            if(s.charAt(i) == ')' || s.charAt(i) == ']'|| s.charAt(i) == '}'){
                if(stack.isEmpty()){
                    return !stack.isEmpty();
                }
            }

            if(s.charAt(i) == '('){
                pct++;
                stack.add('(');
            }
            if(s.charAt(i) == ')'){
                pcct++;
                if(stack.peek() == '('){
                    stack.pop();
                }
            }
            if(s.charAt(i) == '['){
                pct2++;
                stack.add('[');
                
            }
            if(s.charAt(i) == ']'){
                pcct2++;
                if(stack.peek() == '['){
                    stack.pop();
                }
                
            }
            if(s.charAt(i) == '{'){
                pct3++;
                stack.add('{');
            }
            if(s.charAt(i) == '}'){
                pcct3++;
                if(stack.peek() == '{'){
                    stack.pop();
                }
            }
            
        }
        
        
        return stack.isEmpty() && pct == pcct && pct2 == pcct2 && pct3 == pcct3;
        
    }
}
// @lc code=end

