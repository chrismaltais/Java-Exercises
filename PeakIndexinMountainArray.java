class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int peakIndex = 0;
        int peakValue = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > peakValue) {
                peakIndex = i;
                peakValue = A[i];
            }
        }
        return peakIndex;
    }
}
