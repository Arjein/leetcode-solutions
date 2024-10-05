/*
 * @lc app=leetcode id=567 lang=java
 *
 * [567] Permutation in String
 */

 import java.util.*;
// @lc code=start
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr = new int[26];
        int[] arr2 = new int[26];
        for(int i = 0; i< s2.length(); i++){
            if (s1.contains(s2.subSequence(i,i+1))){
                arr = new int[26];
                arr2 = new int[26];
                if(i + s1.length() > s2.length()){
                    return false;
                }
                for(int j = 0; j< s1.length(); j++){
                    arr[s1.charAt(j) - 'a']++;
                    arr2[s2.charAt(i+j) - 'a']++;
                }

               // for(int k = 0; k< arr.length; k++){
                 //   System.out.printf("%d, %d\n", arr[k],arr2[k]);
                //}

                //System.out.println("---------------------------------------------");
                
                if( Arrays.equals(arr, arr2)){
                    return true;
                }
            }
            
        }

        
        return false;
    }
}
// @lc code=end

