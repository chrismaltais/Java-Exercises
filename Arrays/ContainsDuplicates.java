// Given an array of integers, find if the array contains any duplicates.
// Your function should return true if any value appears at least twice in the array,
// and it should return false if every element is distinct.

class Solution {
    // Time Complexity: O(nlgn)
    // Space Complexity: O(1)
    public boolean containsDuplicate(int[] nums) {
        if (nums.length < 2) return false;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                return true;
            }
        }
        return false;
    }
    
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public boolean containsDuplicate1(int[] nums) {
        Set<Integer, Integer> set = new HashSet<Integer, Integer>();
        for (int num : nums) {
            if (set.containsKey(num)) {
                return true;
            }
            set.put(num, 1);
        }
        return false;
    }
}
