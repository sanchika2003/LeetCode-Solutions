class Solution {
    public int findPeakElement(int[] nums) {
        int l=0,mid,h=nums.length-1;
        while(l<h){
            mid=(l+h)/2;
            if(nums[mid]<nums[mid+1]){
                l=mid+1;
            }
            else{
                h=mid;
            }
        }
        return l;
    }
}