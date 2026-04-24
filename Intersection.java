import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();

        // Add elements of nums1 to the set
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        // Check for intersections with nums2
        for (int j = 0; j < nums2.length; j++) {
            if (set.contains(nums2[j])) {
                resultSet.add(nums2[j]); // Add to resultSet if it’s in nums1
                set.remove(nums2[j]);    // Remove to avoid duplicates
            }
        }

        // Convert resultSet to an array
        int[] result = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            result[index++] = num;
        }

        return result;
    }
}

