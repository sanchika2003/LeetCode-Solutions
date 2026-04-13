class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int cnt = 0;

            // skip if already in result
            if (result.contains(nums[i])) continue;

            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) {
                    cnt++;
                }
            }

            if (cnt > n / 3) {
                result.add(nums[i]);
            }
        }

        return result;
    }
}
