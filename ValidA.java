class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        // count letters from s
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // remove using t
        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }

        // check all zero
        for (int i : count) {
            if (i != 0) return false;
        }

        return true;
    }
}
