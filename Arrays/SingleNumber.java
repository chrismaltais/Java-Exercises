// Given a non-empty array of integers,
// every element appears twice except for one.
// Find that single one.

class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int number : nums) {
            result ^= number;
        }
        return result;
    }
}
