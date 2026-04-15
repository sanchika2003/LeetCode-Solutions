class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxlength=0;
        int l=0;
        HashSet<Character>set=new HashSet<>();
        for(int right=0;right<n; right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(right));
            maxlength = Math.max(maxlength, right - l + 1);
        }
        return maxlength;
    }
}
