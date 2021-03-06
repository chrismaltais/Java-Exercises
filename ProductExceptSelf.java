// Given an array of n integers where n > 1, nums
// return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
// Solve it without division and in O(n).
// For example, given [1,2,3,4], return [24,12,8,6].
// Could you solve it with constant space complexity? 
// (Note: The output array does not count as extra space for the purpose of space complexity analysis.)

class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        for (int i = 0, temp = 1; i < nums.length; i++) {
            output[i] = temp;
            temp *= nums[i];
        } // output = [1, 1, 2, 6]
        for (int i = nums.length - 1, temp = 1; i >= 0; i--) {
            output[i] *= temp;
            temp *= nums[i];
        } // output = [24, 12, 8, 6]
        return output;
    }
}