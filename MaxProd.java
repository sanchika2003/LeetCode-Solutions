public class MaxProd {
    public int MaxProdSubArray(int []nums){
        int n=nums.length;
        int maxp=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int p=1;
            for(int j=i;j<n;j++){
              p=p*nums[j];
              maxp=Math.max(maxp,p);
            }
        }
        return maxp;
    }
}
