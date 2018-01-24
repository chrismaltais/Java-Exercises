// Given an array of size n, find the majority element. 
// The majority element is the element that appears more than ⌊ n/2 ⌋ times.
// You may assume that the array is non-empty and the majority element always exist in the array

class Solution {
    // Solution using HashMap
    public int majorityElementHash(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int major = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                int value = map.get(nums[i]);
                map.put(nums[i], value + 1);
            }
            if (map.get(nums[i]) > nums.length/2) {
                 major = nums[i];
            }
        }
        return major;
    }
    
    // Solution using increments/decrements
    public int majorityElement(int[] nums) {
        int major = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                major = nums[i];
                count++;
            } else if (major == nums[i]) {
                count++;
            } else 
                count--;
        }
        return major;
    }
}