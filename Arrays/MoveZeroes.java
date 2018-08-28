// Given an array nums, write a function to move all 0's to the end of it,
// while maintaining the relative order of the non-zero elements.

class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null) return;
        int index = 0;
        // Fill beginning of nums array w numbers
        for (int number : nums) {
            if (number != 0) nums[index++] = number;
        }
        // From index to end of nums fill with 0's
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
