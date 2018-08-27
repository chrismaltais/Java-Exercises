// Given an array, rotate the array to the right by k steps

class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        nums = reverse(nums, 0, nums.length - 1);
        nums = reverse(nums, 0, k - 1);
        nums = reverse(nums, k, nums.length - 1);
    }

    public int getK(int[] nums[], int k) {
        if (k < 1) {
                k =k*(-1)
        } elsea
    }

    public int[] reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }
}

