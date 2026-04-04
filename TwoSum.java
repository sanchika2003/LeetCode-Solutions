/*
LeetCode Problem: 1. Two Sum
Link: https://leetcode.com/problems/two-sum/
Difficulty: Easy
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j, sum=0;
        for(i=0;i<=nums.length;i++){
            for(j=i+1;j<nums.length;j++){
            sum=nums[i]+nums[j];
            if(sum==target){
                return new int[]{i,j};
            }
        }
        }
          return new int[]{};
        
    }
}
