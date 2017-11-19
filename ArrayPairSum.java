// Given an array of 2n integers, your task is to group these integers into n pairs of integers
// say (a1, b1), (a2, b2), ..., (an, bn) 
// which makes sum of min(ai, bi) for all i from 1 to n as large as possible.


public class ArrayPairSum {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }
        return result;
    }
}