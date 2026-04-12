public class MajorityE {
    public int MajorityElement(int []nums){
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            int ct=0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    ct++;
                }
            }
            if(ct>n/2)
        return nums[i];
    }
    return -1;
}
}
