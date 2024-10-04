/*
 * @lc app=leetcode id=2491 lang=java
 *
 * [2491] Divide Players Into Teams of Equal Skill
 */
import java.util.Arrays;
// @lc code=start
class Solution {

    
    public long dividePlayers(int[] skill) {
        int sum = 0;
        for(int i = 0; i< skill.length ;i++){
            sum += skill[i];
        }
        int teams_length = skill.length /2;
        
        int mid = sum / (teams_length);
        Arrays.sort(skill);
        int team_counter = 0;
        long chem = 0;
        if(skill[0] + skill[skill.length-1] > mid){
            return -1;
        }

        for(int n = skill.length / 2 ; n< skill.length; n++){
            if(skill[n] + skill[skill.length-n-1] == mid){
                chem += skill[n] * skill[skill.length-n-1];
                team_counter++;
            }   
        }
            
            
            if(team_counter != teams_length){
                return -1;
            }

        return chem;
        
    }
}
// @lc code=end

